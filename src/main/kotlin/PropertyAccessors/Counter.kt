package com.security.practice.PropertyAccessors

class Counter {
    var value: Int = 0
        private set

    fun inc() = value++
}

fun main() {
    val counter = Counter()
    repeat(10) {
        counter.inc()
    }
    println(counter.value) //10
}