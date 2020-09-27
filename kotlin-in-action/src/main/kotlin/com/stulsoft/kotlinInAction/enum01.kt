/*
 * Copyright (c) 2017. Yuriy Stul
 */

package com.stulsoft.kotlinInAction

enum class Color(private val red: Int, private val green: Int, private val blue: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    GREEN(0, 255, 0);

    fun rgb() = (red * 256 + green) * 256 + blue
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.GREEN -> "Gave"
        }

fun main() {
    println("Color.ORANGE.rgb(): ${Color.ORANGE.rgb()}")
    println("Color.GREEN.rgb(): ${Color.GREEN.rgb()}")

    println("getMnemonic(Color.RED): ${getMnemonic(Color.RED)}")
    println("getMnemonic(Color.ORANGE): ${getMnemonic(Color.ORANGE)}")
    println("getMnemonic(Color.GREEN): ${getMnemonic(Color.GREEN)}")
}
