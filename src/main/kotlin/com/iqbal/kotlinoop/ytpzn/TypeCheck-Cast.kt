package com.iqbal.kotlinoop.ytpzn

/**
 * Dalam OOP kita akan bertemu dengan banyak sekali tipe data (class) dan pewarisan (inheritance)
 * Kadang kita butuh melakukan pengecekan tipe data atau bahkan melakukan konversi data
 *
 * is dan !is Operator
 * is = bisanya digunakan untuk pengecekan apakah sebuah data merupakan tipe data tertentu
 * !is = bisanya digunakan untuk pengecekan apakah sebuah data BUKAN merupakan tipe data tertentu
 *
 */

fun main() {
    // Karena tipe Any bisa bentuk String atau angka
    printObjectWithWhen("Laptop")
    printObject(123)

    printObjectWithWhen(Laptop2("Acer"))
    printObject(Smartphone2("Samsung"))
}

// Pengecekan pake IF
fun printObject(any: Any){
    if (any is Laptop2){
        println("Laptop with name ${any.name}")
    } else if (any is Smartphone2){
        println("Handphone with name ${any.name}")
    } else{
        println(any)
    }
}

// Pengecekan pake WHEN
fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop2 -> println("Laptop with name ${any.name}")
        is Smartphone2 -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

class Laptop2(val name: String) // => : Any()

class Smartphone2(val name: String) // => : Any()