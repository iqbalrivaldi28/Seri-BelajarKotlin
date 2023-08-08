package com.iqbal.kotlinbasic.ytpzn

fun main() {

    var result = double(2)
    println(result)

    var say = sayHello("Jonathan")
    println(say)
}

/*
    ini ada function single expression dimana ngak usah pake curly bracket { lagi
    jika isi dari fungsinya hanya satu baris saja

 */

fun double(a: Int):Int =  a * 2

fun sayHello (name: String) = "HI $name"