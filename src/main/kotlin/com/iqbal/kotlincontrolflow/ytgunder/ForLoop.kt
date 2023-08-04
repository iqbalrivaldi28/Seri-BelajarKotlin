package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    exampleForLoopSatu()

    println()

    exampleForLoopDua()

    println()

    // pake for each
    exampleForLoopTiga()

    println()

    exampleForLoopEmpat()
}



fun exampleForLoopSatu(){
    var angka = 1..10

    for (i in angka ){
        println("value is $i")
    }
}


fun exampleForLoopDua() {
    var range = 1..5

    for((index, value) in range.withIndex()){
        println("index is $index with value $value")
    }
}

// pake for each
fun exampleForLoopTiga() {
    var angkaRange = 1..5

    angkaRange.forEach {
        println("value is $it")
    }
}


fun exampleForLoopEmpat() {
    var number = 10..20

    number.forEachIndexed() { index, value ->
        println("Index of $index with value $value")
    }
}
