package com.iqbal.kotlinbasic.ytpzn

/*
    Function scope adalah ruang lingkup dimana sebuah function bisa diakses
 */

fun main() {

    fun sayHai(name: String){
        println("Hello Kotlin!")
        println("Hai $name")
    }

    sayHai("Iqbal")
}


fun satu(){
    // sayHai()  ( kita  ngak bisa akses fungsi sayHia karena copmenya hanya ada di fungsi main saja
}

fun dua(){
    // sayHai()
}