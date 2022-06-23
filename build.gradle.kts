import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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

// Property which, if true, runs reports too expensive or distracting from the daily build and fails on error.
// Override with: gradle build -PsafeBuildMode=false
val safeBuildMode: String by project
var detektIgnoreFailuresValue: Boolean
var koverEnableAllReports: Boolean
if ( "safeBuildMode" in project.properties && "false" == project.properties["safeBuildMode"] ) {
    logger.info("Build is in non-SAFE mode with safeBuildMode: ${project.properties["safeBuildMode"]}")
    detektIgnoreFailuresValue = false
    koverEnableAllReports = true
}else{
    logger.info("Build is in SAFE mode with safeBuildMode: ${project.properties["safeBuildMode"]}")
    detektIgnoreFailuresValue = true
    koverEnableAllReports = false
}

plugins {
    `kotlin-dsl`
    id("io.gitlab.arturbosch.detekt").version("1.20.0")
    id("org.jetbrains.kotlinx.kover").version("0.5.1")
    //kotlin("jvm").version("1.6.21")
    id("org.jetbrains.kotlin.jvm") version "1.7.0-RC2" // "1.5.31" // "1.6.21"
}

afterEvaluate {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            apiVersion = "1.6"
            languageVersion = "1.6"
        }
    }
    //tasks.withType<JavaCompile>().configureEach {
    //    options.incremental = false
    //}
}

group = "co.uk.polycode"
version = "0.0.1-SNAPSHOT"

java {
    //sourceCompatibility = "18"
    //targetCompatibility = "18"
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

repositories {
    mavenCentral()
}

// Check: gradle -q dependencies --configuration compileClasspath
dependencies {

    // All logging via SLF4J
    implementation("org.slf4j:slf4j-api:1.7.25")
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.20"){
        exclude("org.jetbrains.kotlin")
        exclude("org.slf4j")
    }

    // Testing
    testImplementation(kotlin("test"))

    // Static analysis
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.20.0")
}

// Override default library Task with:
//    ./gradlew regenerate -PuseIncludedBuild=regenerate-with-defaults
//    ./gradlew regenerate -PuseIncludedBuild=regenerate-lib-with-groovy
tasks.register("regenerate") {
    val useIncludedBuildProperty = project.properties["useIncludedBuild"]
    val useIncludedBuild = if ( useIncludedBuildProperty is String ) useIncludedBuildProperty else null
    if ( useIncludedBuild.isNullOrBlank() )
        dependsOn(gradle.includedBuild("regenerate-lib").task(":regenerate"))
    else
        dependsOn(gradle.includedBuild(useIncludedBuild).task(":regenerate"))
}

tasks {
    compileJava {
        //options.isIncremental = false
        dependsOn("regenerate")  // (1)
    }
}

//tasks.withType<JavaCompile>().configureEach {
//    options.isIncremental = false
//    dependsOn("regenerate")
//}

tasks.test {
    useJUnitPlatform()
}

kover {
    isDisabled = !koverEnableAllReports
}

// See: https://detekt.dev/docs/gettingstarted/gradle/
detekt {
    config = files("$projectDir/src/test/detekt/config.yml")
    buildUponDefaultConfig = true
    baseline = file("$projectDir/src/test/detekt/baseline.xml")
    ignoreFailures = detektIgnoreFailuresValue
}
