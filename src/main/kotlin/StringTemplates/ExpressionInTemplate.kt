package com.security.practice.StringTemplates

//${}의 중괄호 안에 식을 넣으면 식 평가
//if (condition) 'a' else 'b' 를 평가한 결과가 전체 ${} 식을 대신한다
fun main() {
    val condition = true
    println(
        "${if (condition) 'a' else 'b'}"
    )
    val x = 11
    println("$x + 4 = ${ x + 4 }")
}