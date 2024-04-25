package com.security.practice.DataTypes

//코틀린은 타입추론을 한다
//하지만 적어야 한다면
//var 식별자: 타입 = 초기화
fun main() {
    println("Sally"+5.9)
//    오류
//    println("Sally"*5.9)

//    val n = 1
//    var p = 1.2
//    이걸 타입을 지정해 줄 경우
    val n: Int = 1
    var p: Double = 1.2

}