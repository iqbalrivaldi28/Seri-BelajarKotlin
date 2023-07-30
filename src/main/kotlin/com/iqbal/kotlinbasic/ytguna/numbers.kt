package com.iqbal.kotlinbasic.ytguna

fun main(){
    numbersConvert()

    maxValues()
}

fun numbersConvert() {
    val numberOne = "10"
    val numberTwo = 10
    val numberThree = null ?: 0 // elvis operator ( dia ngasih nilai default 0 kalau variabelnya null )

    val sum = numberOne.toInt() + numberTwo + numberThree
    println(sum)
    println(numberThree)
}

fun maxValues() {
    val numberInt = Int.MAX_VALUE
    println(numberInt)

    val numberLong = Long.MAX_VALUE
    println(numberLong)
}