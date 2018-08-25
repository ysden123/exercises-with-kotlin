/*
 * Copyright (c) 2018. Yuriy Stul
 */

package com.stulsoft.basics.array

/**
 * @author Yuriy Stul
 */
object ArrEx1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { println(it) }
    }
}