package com.iqbal.kotlinbasic.ytpzn

/*
    Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya,
    lalu diikuti dengan tanda . (titik)
    Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this

 */

fun main() {
    val name = "Pandu"
    val hello: String = name.hello()

    println(hello)
}


fun String.hello(): String {
    return "hello $this"
}