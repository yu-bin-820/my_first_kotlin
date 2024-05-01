package com.security.practice.LoopingAngRanges

fun main() {
    val s = "abc"
    for ( i in 0..s.lastIndex) {
        print(s[i] + 1)
    }

    repeat(2){
        println("hi!")
    }

    var i =1
    println( i++ + ++i)
    println(i++ + 10)
    println(20 * ++i)
}