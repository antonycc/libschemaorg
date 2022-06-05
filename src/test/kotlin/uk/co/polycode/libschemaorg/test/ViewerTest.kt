package uk.co.polycode.libschemaorg.test

//import mu.KotlinLogging
import uk.co.polycode.libschemaorg.Viewer
import kotlin.test.Test
import kotlin.test.assertNotNull

//private val logger = KotlinLogging.logger {}

/**
 * libschemaorg is a Java library built from the Schema.org OWL file.
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
internal class ViewerTest {

    @Test
    fun testViewer() {

        // Expected results
        //val expectedClass = "Place"

        // Setup

        // Execution
        val viewer = Viewer()

        // Validation
        assertNotNull(viewer)
    }
}
