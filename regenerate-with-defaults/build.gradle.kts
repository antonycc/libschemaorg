import java.nio.file.Paths

// libschemaorg is a Java library built from the Schema.org OWL file.
// Copyright (C) 2022  Antony Cartwright, Polycode Limited
//
// This Source Code Form is subject to the terms of the Mozilla Public
// License, v. 2.0. If a copy of the MPL was not distributed with this
// file, You can obtain one at https://mozilla.org/MPL/2.0/.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// Mozilla Public License, v. 2.0 for more details.

buildscript {
    repositories {
        mavenLocal() // OWL to Java Task would be in local
    }
    dependencies {
        classpath("co.uk.polycode:owl-to-java:0.0.1-SNAPSHOT")
    }
}

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

// Override default library Task with:
//    ./gradlew regenerate -PuseIncludedBuild=regenerate-with-defaults
tasks {
    // Regenerate Java classes for schema.org using the OWL schema and default options to a non-source folder.
    val regenerate by registering(uk.co.polycode.owltojava.RegenerateOntologyTask::class) {
        outputs.upToDateWhen { false }
        val srcMain: String = Paths.get("${projectDir}/../src/main").toFile().absolutePath
        val sourceFileName = "schemaorg.owl"
        lang = "en"
        src = Paths.get("${srcMain}/resources/${sourceFileName}").toFile().absolutePath
        dest = Paths.get("${buildDir}/generated-src-with-defaults").toFile().absolutePath
        javaBasePackage = "uk.co.polycode.ontology.with-defaults"
    }
    logger.debug("regenerate task created: ${regenerate}")
}