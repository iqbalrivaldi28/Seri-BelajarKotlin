package com.iqbal.kotlinbasic.ytgunder

fun main (){
    booleanAnd()

    println()

    booleanOr()


    println()

    negasi()
}


fun booleanAnd(){
    val numberOne = 7
    val numberTwo = 5
    val result = 10

    val finalResult = result > numberOne && result > numberTwo  // pake celeanCode ( nanti ada saran di statement if jadi tinggal alt + enter aja )

    println(finalResult)
}


fun booleanOr() {
    val numberOne = 2
    val numberTwo = 3
    val result = 1

    val finalResult = result > numberOne || result < numberTwo

    println(finalResult)
}

fun negasi() {
    val numberOne = 2
    val numberTwo = 3
    val result = 1

    val finalResult = result > numberOne || result > numberTwo

    println(!finalResult)
}