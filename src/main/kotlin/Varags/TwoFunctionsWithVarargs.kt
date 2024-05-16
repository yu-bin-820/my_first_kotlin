package com.security.practice.Varags

fun first(vararg numbers: Int): String {
    var result = ""
    for (i in numbers) {
        result += "[$i]"
    }
    return result
}

fun second(vararg numbers: Int) =
    first(*numbers)


fun main() {
    println(second(7, 9, 32, 65))
}