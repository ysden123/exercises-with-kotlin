/*
 * Copyright (c) 2020. Yuriy Stul
 */

package com.stulsoft.basics.list

import com.stulsoft.basics.data.Obj4Group

/**
 * @author Yuriy Stul
 */
fun main() {
    val list= listOf(
            Obj4Group("n1", 1, 2),
            Obj4Group("n1", 2, 3),
            Obj4Group("n3", 2, 33)
    )
    println("list: $list")

    val grouped = list.groupBy(Obj4Group::age)
    println("grouped: $grouped")
}
