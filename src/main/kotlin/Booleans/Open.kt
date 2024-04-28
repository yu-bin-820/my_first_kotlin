package com.security.practice.Booleans

//boolean의 계산 순서는 &&(and) 다음 ||(or)
fun isOpen1(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: 9-20")
    val status =
        if ( hour >= open && hour <=closed)
            true
        else
            false
    println("Open: $status")
}

fun isOpen2(hour: Int){
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour >= open && hour <= closed
    println("Open: $status")
}

fun main() {
    isOpen1(16)
    isOpen2(6)
}