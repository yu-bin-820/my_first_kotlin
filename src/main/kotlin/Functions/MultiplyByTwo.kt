package com.security.practice.Functions

import kotlin.time.times


//fun 함수이름(p1: 타입1, p2: 타입2, ...): 반환타입 {
//여러 줄의 코드( 한 줄 또는 없을 수도 있음)
//return 결과
fun multiplyByTow(x: Int): Int{
    println("Inside multiplyByTwo")
    return x * 2
}

fun main() {
    val r = multiplyByTow(5)
    println(r)
}