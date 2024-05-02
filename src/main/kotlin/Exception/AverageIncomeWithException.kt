package com.security.practice.Exception

fun averageIncome2(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException(
            "Months can't be zero"
        )
    else
        income / months

fun main() {
    averageIncome2(3300, 0)
}