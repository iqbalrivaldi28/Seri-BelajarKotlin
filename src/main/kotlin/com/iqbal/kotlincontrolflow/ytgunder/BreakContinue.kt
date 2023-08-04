package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    exampleBreak()
    println()
    exampleContinue()
}

fun exampleBreak() {
    val listOf = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOf){
        if (i == null) break
        println(i)
    }
}

fun exampleContinue() {
    val listOf = listOf(1, 2, 3, null, 5, null, 7)

    for (a in listOf){
        if (a == null) continue
        println(a)
    }
}