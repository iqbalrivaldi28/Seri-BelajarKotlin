package com.iqbal.kotlinbasic.ytpzn

fun main() {
    println(factorialLoop(10))

    println(factorialRecursive(10))
}


// Pake Loop
fun factorialLoop(value: Int): Int {
    var result = 1

    for (i in value downTo 1){
        result *= i
    }
    return result
}

// Pake Rekursive

fun factorialRecursive(value: Int): Int{
    return when(value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}
