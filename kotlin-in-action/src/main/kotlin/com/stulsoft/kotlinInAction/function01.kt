/*
 * Copyright (c) 2017. Yuriy Stul
 */

package com.stulsoft.kotlinInAction

fun f1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun f2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("f1(1,2) is ${f1(1, 2)}")
    println("f2(1,2) is ${f2(1, 2)}")
}
