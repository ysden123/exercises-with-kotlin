/*
 * Copyright (c) 2017. Yuriy Stul
 */

package com.stulsoft.kotlinInAction

data class Person(val name: String,
                  val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"),
            Person("Bob", age = 29))

    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)
