# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/data-api/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/data-api/actions/workflows/gradle.yml)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/data-api.svg?style=flat)](https://github.com/astrapi69/data-api/issues)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/data-api)](https://central.sonatype.com/artifact/io.github.astrapi69/data-api)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/data-api.svg)](http://www.javadoc.io/doc/io.github.astrapi69/data-api)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)
[![Hits Of Code](https://hitsofcode.com/github/astrapi69/data-api)](https://hitsofcode.com/github/astrapi69/data-api/view)

</div>

This api project provides interfaces that data objects(for instance jpa entities or DTO objects) can implement for
providing api features like:

- identifiable objects
- id generation
- provide information for the creation, last modification and deletion
- activate or deactivate objects
- name- or textable objects that holds a name property
- versionable objects that holds a version property
- key value pair objects
- processable objects
- traceable objects
- treeable objects
- validatable objects
- verifiable objects
- visibility of objects
- and composition of the above described objects

Note: The project holds only interfaces and has no dependencies to other libraries

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/data-api" data-icon="octicon-star" aria-label="Star astrapi69/data-api on GitHub">Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

## Import dependencies to your project

<details>
  <summary>gradle (click to expand)</summary>

## gradle dependency

Replace the variable ${latestVersion} with the current latest
version: [![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/data-api)](https://central.sonatype.com/artifact/io.github.astrapi69/data-api)

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of data-api:

define version in file gradle.properties

```
dataApiVersion=${latestVersion}
```

or in build.gradle ext area

```
    dataApiVersion = "${latestVersion}"
```

then add the dependency to the dependencies area

```
    implementation("io.github.astrapi69:data-api:$dataApiVersion")
```

# with new libs.versions.toml file

If you use the new libs.versions.toml file for new automatic catalog versions update

```
[versions]
data-api-version= "${latestVersion}"

[libraries]
data-api = { module = "io.github.astrapi69:data-api", version.ref = "data-api-version" }
```

then add the dependency to the dependencies area

```
    implementation libs.data.api
```

</details>

<details>
  <summary>Maven (click to expand)</summary>

## Maven dependency

The library is on Maven Central. Check out [Maven Central](https://central.sonatype.com/artifact/io.github.astrapi69/data-api) for the latest release.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of data-api:

Then you can add the dependency to your dependencies:

    <properties>
        ...

```xml
        <!-- data-api version -->
<data-api.version>${latestVersion}</data-api.version>
```

        ...
    </properties>
        ...
        <dependencies>
        ...

```xml
            <!-- data-api DEPENDENCY -->
<dependency>
    <groupId>io.github.astrapi69</groupId>
    <artifactId>data-api</artifactId>
    <version>${data-api.version}</version>
</dependency>
```

        ...
        </dependencies>

</details>


<details>
  <summary>Snapshots (click to expand)</summary>

## 📸 Snapshots

This section describes how to import snapshot versions into your project.
Add the following code snippet to your gradle file in the repositories section:

```
repositories {
   //...
```

```groovy
    maven {
    name "Central Portal Snapshots"
    url "https://central.sonatype.com/repository/maven-snapshots/"
    mavenContent {
        snapshotsOnly()
    }
}
```
```
}
```

</details>

## Note

No animals were harmed in the making of this library.

## Support this project

If data-api is useful to you, a star on [GitHub](https://github.com/astrapi69/data-api) helps others find it.
Sharing it or reporting a bug helps just as much.

If you would like to contribute financially, the channels are on the repository's Sponsor button, which
reads [.github/FUNDING.yml](.github/FUNDING.yml): GitHub Sponsors, Liberapay, Ko-fi and PayPal.

## License

The source code comes under the liberal MIT License, making data-api great for all types of applications.

## Semantic Versioning

The versions of data-api are maintained with the Simplified Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning for this project you can visit
this [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Simplified-Semantic-Versioning)
.

## Want to Help and improve it? ###

The source code for data-api are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/data-api/fork](https://github.com/astrapi69/data-api/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/data-api/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the data-api developers with your questions, concerns, comments, bug reports, or feature
requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/astrapi69/data-api/issues).

## Credits

|**Maven Central**|
|     :---:      |
|[![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/data-api?style=for-the-badge)](https://central.sonatype.com/artifact/io.github.astrapi69/data-api)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/data-api.svg)](http://www.javadoc.io/doc/io.github.astrapi69/data-api)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |

## Git hooks

The repository's git hooks live in `.githooks`: `commit-msg` where present, and `pre-commit`, which refuses a
commit whose files Spotless would format. Activate them once per clone or worktree:

```bash
git config core.hooksPath .githooks
```
