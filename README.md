# Overview

<div style="text-align: center">

[![Build Status](https://travis-ci.org/astrapi69/ent-api.svg?branch=master)](https://travis-ci.org/astrapi69/ent-api) 
[![Open Issues](https://img.shields.io/github/issues/astrapi69/ent-api.svg?style=flat)](https://github.com/astrapi69/ent-api/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/ent-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/ent-api)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/ent-api.svg)](http://www.javadoc.io/doc/io.github.astrapi69/ent-api)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

This api project provides interfaces that data objects(for instance jpa entities) can implement for providing api features like:

- identifiable objects
- provide information for the creation, last modified and deletion
- activate or deactivate objects
- name- or textable objects that holds a name property
- versionable objects that holds a version property
- key value pair objects
- processable objects
- tracable objects
- treeable objects
- validatable objects
- verifiable objects
- visibility of objects
- and combination of the above descipted objects 

Note: The project holds only interfaces and has no dependencies to other libraries

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library.


# Donations

If you like this library, please consider a donation through bitcoin or over bitcoin-cash with:

36JxRRDfRazLNqUV6NsywCw1q7TK38ukpC

or over ether with:

0x588Aa02De98B1Ef70afeDC3ec5290130a3E5e273

or over donate buttons at the top

## License

The source code comes under the liberal MIT License, making ent-api great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~ent-api~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of ent-api:

Than you can add the dependency to your dependencies:


	<properties>
			...
		<!-- ENT-API version -->
		<ent-api.version>2</ent-api.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- ENT-API DEPENDENCY -->
			<dependency>
				<groupId>io.github.astrapi69</groupId>
				<artifactId>ent-api</artifactId>
				<version>${ent-api.version}</version>
			</dependency>
			...
		</dependencies>

## gradle dependency

Add the following gradle dependency to your project `build.gradle` in the dependencies section if you want to import 
the core functionality of ent-api:

define version in file gradle.properties
```

entApiVersion=2
```

or in build.gradle ext area

```
ext {
			...
    entApiVersion = "2"
			...
}
```

and than add the dependency to the dependencies area

```
dependencies {
			...
	implementation("io.github.astrapi69:ent-api:$entApiVersion")
			...
}
```

## Semantic Versioning

The versions of ent-api are maintained with the Simplified Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning for this project you can visit this [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Simplified-Semantic-Versioning).

## Want to Help and improve it? ###

The source code for ent-api are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/ent-api/fork](https://github.com/astrapi69/ent-api/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/ent-api/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the ent-api developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/ent-api/issues).

## Credits

|**Travis CI**|
|     :---:      |
|[![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)](https://coveralls.io/github/astrapi69/ent-api?branch=master)|
|Special thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/io.github.astrapi69/ent-api.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~ent-api~~~)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/ent-api.svg)](http://www.javadoc.io/doc/io.github.astrapi69/ent-api)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |
