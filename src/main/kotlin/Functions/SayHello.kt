package com.security.practice.Functions

//Unit : 의미 있는 결과를 제공하지 않는 함수의 반환타입
fun sayHello() {
    println("Hallo!")
}

fun sayGoodbye() : Unit {
    println("Auf Wiedersehen!")
}

fun main() {
    sayHello()
    sayGoodbye()
}