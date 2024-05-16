package com.security.practice.Sets

fun main() {
    val intSet = setOf(1, 1, 2, 3, 9, 9, 4)

    println(intSet)//[1, 2, 3, 9, 4]-중복값 제거
    println(9 in intSet)//true
    println(99 in intSet)//false
    println(intSet.contains(9))//true
    println(intSet.containsAll(setOf(1, 9, 2)))//true
    println(intSet.union(setOf(3, 4, 5, 6)))//[1, 2, 3, 9, 4, 5, 6] - 합집합
    println(intSet intersect setOf(0, 1, 2, 7, 8))//[1, 2] - 교집합
    println(intSet subtract setOf(0, 1, 9, 10))//[2, 3, 4] - 차집합

}