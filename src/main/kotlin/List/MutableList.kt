package com.security.practice.List

fun main() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    println(list)
    //getLsit 읽기 전용 list
    val list2 = getList()
    println(list2)
}

fun getList(): List<Int> {
    return mutableListOf(1, 2, 3)
}