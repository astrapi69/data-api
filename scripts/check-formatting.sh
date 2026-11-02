#!/usr/bin/env bash
#
# Refuses a commit whose files Spotless would format (#3).
#
# The pre-commit hook runs it; the build checks the same with spotlessCheck, which is where a
# forgotten spotlessApply used to surface, a build or a CI run later. The same script runs in every
# repository of the family that uses Spotless (astrapi69/mystic-crypt-ui#592).
#
# Only what Spotless covers counts, and only when the commit stages it:
#   src/**/*.java                          spotlessJavaCheck
#   *.gradle, *.md, .gitignore at the top  spotlessMiscCheck
# A commit that touches nothing of the above costs no Gradle run. With a Gradle daemon running, the
# check takes under a second (measured in mystic-crypt-ui on 2026-10-17: 0.5 to 0.9 s; 5.3 s without
# a daemon).
#
# Spotless checks the files as they are in the working tree, so a file staged in one form and edited
# further is checked in its edited form.
#
#   scripts/check-formatting.sh            GRADLEW overrides the Gradle wrapper
set -euo pipefail

root="$(git rev-parse --show-toplevel)"
gradlew="${GRADLEW:-$root/gradlew}"

java=false
misc=false
while IFS= read -r -d '' path; do
  case "$path" in
    src/*.java) java=true ;;
    */*) ;;
    *.gradle | *.md | .gitignore) misc=true ;;
  esac
done < <(git -C "$root" diff --cached --name-only --diff-filter=ACMR -z)

tasks=()
[ "$java" = true ] && tasks+=(spotlessJavaCheck)
[ "$misc" = true ] && tasks+=(spotlessMiscCheck)
[ "${#tasks[@]}" -gt 0 ] || exit 0

# Gradle runs on the JDK the repository names in .sdkmanrc, when it names one: its build may not run on
# the shell's. A named JDK that is not installed refuses the commit with the command that installs it.
if [ -f "$root/.sdkmanrc" ]; then
  candidate="$(sed -n 's/^java=//p' "$root/.sdkmanrc")"
  if [ -n "$candidate" ]; then
    jdk="${SDKMAN_DIR:-$HOME/.sdkman}/candidates/java/$candidate"
    if [ ! -x "$jdk/bin/java" ]; then
      echo "==> commit refused: .sdkmanrc names java $candidate, which is not installed (#3)" >&2
      echo "    install it:       sdk install java $candidate" >&2
      exit 1
    fi
    export JAVA_HOME="$jdk"
  fi
fi

if output="$("$gradlew" -p "$root" "${tasks[@]}" -q --console=plain 2>&1)"; then
  exit 0
fi
{
  printf '%s\n' "$output"
  echo
  echo "==> commit refused: Spotless would format the files named above (#3)"
  echo "    format them:      ./gradlew spotlessApply"
  echo "    then stage them again with git add, and commit again"
} >&2
exit 1
