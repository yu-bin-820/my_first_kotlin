package com.security.practice.StringTemplates

//$answer는 answer의 값으로 치환된다
//$다음에 오는 대상이 프로그램 식별자로 인식되지 않으면 아무 일도 일어나지 않는다
fun main() {
    val answer = 42
    println("Found $answer!")
    println("printing a $1")
}