package com.security.practice.PropertyAccessors

class Default {
    var i: Int = 0
        get() {
            println("get()")
            return field
        }
        set(value) {
            println("set($value)")
            field = value
        }
}

fun main() {
    val d = Default()
    d.i = 2
    println(d.i)

}
