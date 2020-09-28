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
    thread(isDaemon = true) {   // Doesn't wait completion. Exits with main thread
//    thread(/*isDaemon = false*/) {    // Waits completion. Doesn't eExit with main thread
        logger.info("In thread")
        Thread.sleep(500)
        logger.info("Completed")
    }

//    Thread.sleep(1_000)
    logger.info("Finish")
}
