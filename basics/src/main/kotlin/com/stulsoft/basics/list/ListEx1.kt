/*
 * Copyright (c) 2018. Yuriy Stul
 */

package com.stulsoft.basics.list

fun main(args: Array<String>) {
    val l1 = listOf(1, 2, 3, 4, 5, 6)
    println("l1.filter { it >3 }=${l1.filter { it > 3 }.toString()}")

}