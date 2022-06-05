# libschemaorg

A Java library of the Schema.org ontology built using OWL to Java and the OWL definition from Schema.org.

# Done

OWL to Java currently:
* Builds a skeleton project

# Bugs

* *(a bulleted list of bugs)*

# TODO

* Generate source from OWL to Java gradle task
* Build with Java 18 and Kotlin 1.7.x
* Generate Java 8 compatible source and Java 8 compatible library
* Run tests in Java 8
* Use a generate-source phase
* Compile java source
* Tests to validate a sample of objects
* Automated tests to walk the object graph
* generate in ./src/main/java and commit
* Versioning policy, auto increment and release.
* License dependency extraction
* Consider progress against GitHub badges e.g. https://github.com/detekt/detekt
* Publish Schema.org library Jar
* **Publish: Release 1.0.0 to GitHub packages**
* Java Docs for output
* Automate library updates
* Contributor guidelines
* **Library Launch: Release to Maven Central**


# See also

* Class and field definitions are generated based on OWL https://www.w3.org/TR/owl-guide/
* The ontology from https://schema.org/ is the primary use case for this project.

# Examples:

TODO: Build with tests which generate Java Sources and walk object graph:
```shell
 % gradle clean test
 % 
```

The first 20 lines of Person Java object generated from a Parsed Schema.org OWL Schema describing humanity:
```shell
 % head -20 ./build/generated-sources/uk/co/polycode/org/schema/Person.java
```
```java
package uk.co.polycode.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * A person (alive, dead, undead, or fictional).
 */
public class Person extends Thing {
	/**
	 * Where to find the definition of the OWL Class used to generate this Java class.
	 */
	public String isDefinedBy = "https://schema.org/Person";

	/**
	 * An additional name for a Person, can be used for a middle name.
	 */
	public String additionalName;
	
	//truncated..
}
```

# Examples:

TODO: Running the viewer from Person
```shell
Person
\--location: Address
\--\--streetName: String
\--\--postcode: String
\--dateOfBirth: Date
```

# Contributions

libschemaorg uses Trunk based Development https://www.flagship.io/git-branching-strategies/#trunk-based-development

An alternate branching strategy is likely to be required when there are multiple committers. While a low volume of
commits and committers remains we have two **paths to contribute to this project**:
* Contact me via my GitHub profile (->website -> LinkedIn) and ask to be added to this project.
* Fork the repository then create a pull request.

## Request a feature

To request a new feature:
1. Add an item to the TODO list

(see above for **paths to contribute to this project**).

## Add a feature

To add a new feature:
1. Pick a feature from this `README.md`
2. Create at least one test for the feature, cut and paste the TODO list item into the test comment
3. Build using `gradle build`
4. Commit code which passes `gradle clean check -PsafeBuildMode=false`
5. Get the commit hash using `git rev-parse HEAD` and add it to the test KDoc.

e.g.
```kotlin
    /**
     *  The Viewer should render a Person and Address
     *  @since("Commit hash: e66cfd2dedd09bb496ac852a630ee1fb00fake00")
     */
    @Test
    fun testExpectedClassViewerOutput() {
        // truncated...
    }
```

# Licence

## Licence - libschemaorg

libschemaorg is released under the Mozilla Public License, v. 2.0:
```java
/**
 * libschemaorg builds Source Code from the Schema.org OWL file
 * Copyright (C) 2022  Antony Cartwright, Polycode Limited
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Mozilla Public License, v. 2.0 for more details.
 */
```

## Licence - Schema.org

libschemaorg uses the Schema from Schema.org which is released under the Creative Commons Attribution-ShareAlike License (version 3.0): https://creativecommons.org/licenses/by-sa/3.0/
Schema.org Version 14.0 is currently used and this can be downloaded from https://schema.org/docs/schemaorg.owl
( Release archive: https://github.com/schemaorg/schemaorg/tree/main/data/releases/14.0/ )
The following files are copies of or derivatives of Schema.org schemas:
```shell
./src/test/resources/schemaorg.owl - Schema.org Version 14.0: copy of https://schema.org/docs/schemaorg.owl
```
Java objects generated from these files are referenced in libschemaorg source code and tests

## Licence - OWL to Java

libschemaorg uses OWL to Java which released under the Mozilla Public License, v. 2.0. If a copy of the MPL was not distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/.
