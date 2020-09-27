/*
 * Copyright (c) 2020. Yuriy Stul
 */

package com.stulsoft.basics.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * @author Yuriy Stul
 */

private val logger: Logger = LoggerFactory.getLogger("")

fun main() {
    logger.info("Started")
    val l = LogEx1()
    l.foo(123)
}
