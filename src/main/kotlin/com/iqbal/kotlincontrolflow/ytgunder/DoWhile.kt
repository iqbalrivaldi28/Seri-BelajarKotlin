package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    exampleDoWhile()
}

fun exampleDoWhile(){
    var angka = 6

    do {
        println("Ini baris ke- $angka")
        angka++
    } while (angka <=5)
}