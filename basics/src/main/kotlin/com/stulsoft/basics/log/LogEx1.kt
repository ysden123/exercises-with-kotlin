/*
 * Copyright (c) 2020. Yuriy Stul
 */

package com.stulsoft.basics.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * @author Yuriy Stul
 */
class LogEx1 {
    companion object {
        private val logger: Logger = LoggerFactory.getLogger("")
    }

    fun foo(n: Int) {
        logger.info("n = {}", n)
        logger.info("n = $n")
    }

}
