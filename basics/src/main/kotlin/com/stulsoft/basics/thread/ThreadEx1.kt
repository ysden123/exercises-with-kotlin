/*
 * Copyright (c) 2020. Yuriy Stul
 */

package com.stulsoft.basics.thread

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.concurrent.thread

/**
 * @author Yuriy Stul
 */

private val logger: Logger = LoggerFactory.getLogger("")

fun main() {
    logger.info("Start")
    thread(start = true) {
        logger.info("In thread")
    }

    Thread.sleep(1000)
    logger.info("Finish")
}
