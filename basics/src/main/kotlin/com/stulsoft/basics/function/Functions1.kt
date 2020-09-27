/*
 * Copyright (c) 2018. Yuriy Stul
 */

package com.stulsoft.basics.function

fun foo1(n: Int): Int {
    val n1 = n * 100
    return n1 + 15
}

fun foo2(n: Int): Int = n + 11
fun foo3(n: Int) = n + 11
fun foo4(n: String) {
    println("n is $n")
}

fun main() {
    println("==>main")
    println("foo1(11)=${foo1(11)}")
    println("foo2(11)=${foo2(11)}")
    println("foo3(11)=${foo3(11)}")
    foo4("Test 222")
    println("<==main")
}
