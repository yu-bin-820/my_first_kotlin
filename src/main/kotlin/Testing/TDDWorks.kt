package com.security.practice.Testing

fun main() {
    println(calculateBMI(160.0, 68.0))
    println(calculateBMI(100.0, 68.0))
    println(calculateBMI(200.0, 68.0))
}

fun calculateBMI(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}