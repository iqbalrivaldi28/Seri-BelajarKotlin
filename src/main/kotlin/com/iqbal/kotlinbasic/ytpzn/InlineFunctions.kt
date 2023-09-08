package com.iqbal.kotlinbasic.ytpzn

fun main() {
    println(hello { "Iqbal" })
    print(hello { "Ical" })
}

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}