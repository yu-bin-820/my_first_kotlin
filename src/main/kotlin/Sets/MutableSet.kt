package com.security.practice.Sets

//mutableSetOf-가변, setOf-읽기전용
fun main() {
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 42
    mutableSet += 42
    println(mutableSet)//42
    mutableSet -= 42
    println(mutableSet)//
}