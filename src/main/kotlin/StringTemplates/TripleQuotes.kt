package com.security.practice.StringTemplates

//"출력은 \ 다음, """로 감싸선
fun main() {
    val s = "value"
    println("s = \"$s\".")
    println("""s="$s".""")
}