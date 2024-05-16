package com.security.practice.PropertyAccessors

class Data(var i: Int)

fun main() {
    val data = Data(10)
    println(data.i)//10
    data.i = 20
    println(data.i)//20
}