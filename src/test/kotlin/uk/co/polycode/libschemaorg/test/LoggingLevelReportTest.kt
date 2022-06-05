package uk.co.polycode.owltojava.test

import mu.KotlinLogging
import org.slf4j.impl.StaticLoggerBinder
import kotlin.test.Test

private val logger = KotlinLogging.logger {}

/**
 * OWL to Java generates Source Code from the W3C Web Ontology Language (OWL)
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
internal class LoggingLevelReportTest {

    @Test
    fun testLogger() {
        logger.trace("Test logged using SLF4J API at level: Trace")
        logger.debug("Test logged using SLF4J API at level: Debug")
        logger.info("Test logged using SLF4J API at level: Info")
        logger.warn("The current logging implementation is ${StaticLoggerBinder.getSingleton().loggerFactory}")
        logger.warn("Test logged using SLF4J API at level: Error")
        logger.error("Test logged using SLF4J API at level: Warning")
    }
}
