package com.security.practice.NumberTypes

//정수 나눗셈에서 나머지는 버림
//Double을 int로 사용시 다른값 나옴
//같은 값 나오려면 곱셈 먼저 하고 나눗셈
fun bmiMetric(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Under weight"
    else if (bmi < 25 ) "Normal weight"
    else "Over weight"
}

fun bmiEnglish(
    weight: Int,
    height: Int
):String{
    val bmi =
        weight / (height * height ) * 703.07
    return if (bmi<18.5) "Under weight"
    else if (bmi<25) "Normal weight"
    else "Overweight"
}

fun main() {
    val weight = 72.57
    val height = 1.727
    val status = bmiMetric(weight, height)
    println(status)

    val weightEnglish = 160
    val heightEnglish = 68
    val statusEnglish = bmiEnglish(weightEnglish, heightEnglish)
    println(statusEnglish)
}

