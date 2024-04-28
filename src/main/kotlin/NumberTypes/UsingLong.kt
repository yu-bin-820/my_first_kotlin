package com.security.practice.NumberTypes

//long으로 계산하도록 강제하고 결과도 Long이 되도록
fun main() {
    val i = Int.MAX_VALUE
    println(0L+i+i)
    println(1_000_000*1_000_000L)
}