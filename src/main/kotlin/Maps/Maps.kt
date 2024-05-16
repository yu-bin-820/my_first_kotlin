package com.security.practice.Maps

fun main() {
    val constants = mapOf(
        "Pi" to 3.14,
        "e" to 2.71,
        "phi" to 1.61
    )
    println(constants)//{Pi=3.14, e=2.71, phi=1.61}
    println(constants["e"])//2.71
    println(constants.keys)//[Pi, e, phi]
    println(constants.values)//[3.14, 2.71, 1.61]

}