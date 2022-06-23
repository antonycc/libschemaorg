#!/usr/bin/env bash
# libschemaorg is a Java library built from the Schema.org OWL file.
# Copyright (C) 2022  Antony Cartwright, Polycode Limited
#
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at https://mozilla.org/MPL/2.0/.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
# Mozilla Public License, v. 2.0 for more details.
#
# Purpose: Run the gradle build inside a container and mount the local workspace
# Performance metrics:
#   Native:
#      ./gradlew clean build -x test
#      1.41s user 0.13s system 18% cpu 8.300 total
#   In this container:
#       ./build-in-docker.sh
#       real 2m15.653s user 0m4.796s sys 0m1.032s
# Usage:
#    ./build-in-docker.sh

docker run --interactive --tty --env LOCAL_GITHUB_ACTOR --env LOCAL_GITHUB_TOKEN --mount type=bind,source="$(pwd)",target=/workspace eclipse-temurin:18-jdk bash -c 'cd /workspace && ./gradlew clean regenerate build'
