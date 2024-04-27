package com.security.practice.StringTemplates

//문자 연결은 +
fun main() {
    val s = "hi\n"
    val n = 11
    val d = 3.14

    println("first: " + s + "second: " +
        n + ", third: " + d )

    println("first: $s second: " +
            "$n , third: $d" )
}