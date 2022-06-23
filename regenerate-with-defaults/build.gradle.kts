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
        //mavenLocal() // Use when OWL to Java Task is built on the same workstation
        listOf("/antonycc/owl-to-java").forEach { path ->
            maven {
                setUrl("https://maven.pkg.github.com${path}")
                content {
                    includeGroup("co.uk.polycode")
                }
                credentials {
                    username =
                        System.getenv("LOCAL_GITHUB_ACTOR")
                            ?: project.findProperty("GITHUB_ACTOR") as String?
                                    ?: System.getenv("GITHUB_ACTOR")
                                    ?: "no user"
                    password =
                        System.getenv("LOCAL_GITHUB_TOKEN")
                            ?: project.findProperty("GITHUB_TOKEN") as String?
                                    ?: System.getenv("GITHUB_TOKEN")
                                    ?: "no token"
                }
            }
        }
    }
    dependencies {
        classpath("co.uk.polycode:owl-to-java:0.1.1")
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
        src = Paths.get("${srcMain}/resources/${sourceFileName}").toFile()
        dest = Paths.get("${buildDir}/generated-src-with-defaults").toFile()
        javaBasePackage = "uk.co.polycode.ontology.with-defaults"
    }
    logger.debug("regenerate task created: ${regenerate}")
}