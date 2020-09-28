/*
 * Copyright (c) 2020. Yuriy Stul
 */

package com.stulsoft.basics.thread

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

/**
 * @author Yuriy Stul
 */

private val logger: Logger = LoggerFactory.getLogger("")

fun main() {
    logger.info("Start")
    val executorService = Executors.newCachedThreadPool()
    val result = calc(executorService).get()
    logger.info("result=$result")
    executorService.shutdown()
}

fun calc(executorService: ExecutorService): Future<String> {
    logger.info("Start calc")
    val completableFuture: CompletableFuture<String> = CompletableFuture()

    executorService.submit {
        logger.info("In thread")
        Thread.sleep(1000)
        logger.info("Thread finished")
        completableFuture.complete("Done")
    }
    return completableFuture
}
