package com.security.practice.DataTypes

fun main() {
    val whole: Int = 11
    val fractional: Double = 1.4
    val trueOrFalse: Boolean = true
    val word: String = "A value"
    val character: Char = 'z'
    val lines: String = """Triple quotes let
        |you have many lines
        |in your string
    """.trimMargin()

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(word)
    println(character)
    println(lines)
}