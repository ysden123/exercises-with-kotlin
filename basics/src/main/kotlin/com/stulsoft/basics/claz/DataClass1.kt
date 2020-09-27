/*
 * Copyright (c) 2018. Yuriy Stul
 */

package com.stulsoft.basics.claz

/**
 * @author Yuriy Stul
 */
data class DataClass1(val name: String, val age: Int)

fun main() {
    val dc1 = DataClass1("yuriy", 12)
    println("dc1.component1()=${dc1.component1()}")
    println("dc1.component2()=${dc1.component2()}")
    println("dc1.hashCode()=${dc1.hashCode()}")
    println("dc1=$dc1")
}
