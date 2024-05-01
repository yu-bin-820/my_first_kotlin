package com.security.practice.Visibility

class Cookie (
    private  var isReady: Boolean
){
    private fun cumble() = println("crumble")

    public fun bite() = println("bite")

    fun eat() {
        isReady = true
        cumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()
    x.eat()
}