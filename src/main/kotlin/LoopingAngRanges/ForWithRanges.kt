package com.security.practice.LoopingAngRanges

// downTo : 감소 범위
// step : 간격 변경
fun showRange ( r: IntProgression) {
    for ( i in r ){
        print("$i")
    }
    print("//$r")
    println()
}

fun main() {
    showRange(1..5)
    showRange(1 until 5)
    showRange(5 downTo 1)
    showRange(0..9 step 2)
    showRange(0 until 10 step 3)
    showRange(9 downTo 3 step 3)
}