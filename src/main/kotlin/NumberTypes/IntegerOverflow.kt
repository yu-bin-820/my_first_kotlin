package com.security.practice.NumberTypes

//Integer가 담을 수 있는 양을 넘으면 overflow발생으로 틀린 값 나옴
fun main() {
    val i: Int = Int.MAX_VALUE
    println(i+i)
}