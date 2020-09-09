## Change log
----------------------

Version 1.12-SNAPSHOT
-------------

Version 1.11
-------------

ADDED:

- a new interface Processable and VerifiableProcessable

CHANGED:

- update gradle to new version 6.6.1

Version 1.10
-------------

ADDED:

- a new interface IdentifiableByDeletable and IdentifiableByLastModified
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.31.0

Version 1.9
-------------

ADDED:

- a new interface Accomplishable and ByAccomplishable
- a new interface ByCreatable created that reflects the old Creatable
- a new interface ByDeletable created that reflects the old Deletable
- a new interface ByLastModified created that reflects the old LastModified

CHANGED:

- removed the field createdBy from the interface Creatable
- removed the field deletedBy from the interface Deletable
- removed the field lastModifiedBy from the interface LastModified
- adapted all interfaces the extended the old Creatable and replaced with the new interface ByCreatable
- adapted all interfaces the extended the old Deletable and replaced with the new interface ByDeletable
- adapted all interfaces the extended the old LastModified and replaced with the new interface ByLastModified
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.29.0

Version 1.8
-------------

ADDED:

- missing interfaces that make combination of the main interfaces 

CHANGED:

- renamed several packages for clarity

Version 1.7
-------------

ADDED:

- gradle related files created
- a new interface Verifiable that can be signed and verified
- new idea run configurations for gradle tasks created
- new constant variables to enum class DatabasePrefix
- new gradle.properties file

CHANGED:

- update gradle to new version 6.5.1
- migration from maven to build system gradle
- removed all maven related files
- description of project extended in README.md file

Version 1.6
-------------

CHANGED:

- renamed the constant UNDERSCORE_PREFIX to UNDERSCORE in enum DatabasePrefix
- renamed enum variable UNDERSCORE to UNDERLINE in enum DatabasePrefix

Version 1.5
-------------

ADDED:
 
- project github files created

CHANGED:

- moved column constants from the entity classes to the appropriate interfaces

Version 1.4.1.1
-------------

ADDED:
 
- new constants for the prefixes in enum DatabasePrefix

Version 1.4
-------------

ADDED:
 
- new enum class DatabasePrefix from ent-core to this project

Version 1.3.1
-------------

ADDED:
 
- a new interface Treeable that provides keeping data with in a tree structure

Version 1.2.1
-------------

ADDED:
 
- a new configuration uploadArchives in build.gradle for upload maven artifacts to maven repository

Version 1.2
-------------

ADDED:
 
- new interfaces for store a variable length of text values

Version 1.1
-------------

ADDED:
 
- a new interface for truncate a underlying data source

Version 1
-------------

ADDED:
 
- this changelog file
