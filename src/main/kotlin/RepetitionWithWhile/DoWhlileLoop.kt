package com.security.practice.RepetitionWithWhile

fun condition(i: Int) = i < 100

fun main() {
    var i = 0
    while (condition(i)){
        print(".")
        i += 10
    }

    do{
        println(".")
        i += 10
    }while (condition(i))
}