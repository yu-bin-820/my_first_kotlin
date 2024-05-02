package com.security.practice.Exception

//예측 가능한 오류 방지하기
fun averageIncome(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main() {
    println(averageIncome(3300, 3))
    println(averageIncome(5000, 0))
}