package com.security.practice.Maps

//mutableMap-수정 가능, Map-읽기전용
fun main() {
    val m = mutableMapOf(5 to "five", 6 to "six")
    println(m[5])//five
    m[5] = "5ive"
    println(m[5])//5ive
    m += 4 to "four"
    println(m)//{5=5ive, 6=six, 4=four}
    println(m.getOrDefault(5, "??"))//5ive
    println(m.getOrDefault(1, "??"))//??

}