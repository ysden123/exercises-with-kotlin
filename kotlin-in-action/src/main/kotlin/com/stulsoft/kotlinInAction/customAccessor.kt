/*
 * Copyright (c) 2017. Yuriy Stul
 */

package com.stulsoft.kotlinInAction

/**
 * @author Yuriy Stul
 */

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main(args: Array<String>) {
    val r1 = Rectangle(1, 2)
    println("r1(${r1.height},${r1.width}) is square: ${r1.isSquare}")
    val r2 = Rectangle(2, 2)
    println("r2(${r2.height},${r2.width}) is square: ${r2.isSquare}")
}