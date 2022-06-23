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

plugins {
    `kotlin-dsl`
}

afterEvaluate {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            apiVersion = "1.6"
            languageVersion = "1.6"
        }
    }
}

java {
    //sourceCompatibility = "18"
    //targetCompatibility = "18"
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

repositories {
}

dependencies {
}
