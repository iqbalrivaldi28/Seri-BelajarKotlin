package com.iqbal.kotlinoop.ytpzn

/**
 * Sealed Class merupakan jenis class yang didesain untuk Inheritance
 * Sealed Class tidak bisa diinisialisasi menjadi Object kareana secara standat dia marupakan abastract class
 * Sealed Class sangat cocok untuk digunakan sebagar parent Class
 *
 * Sealed Class sangat berguna saat kita menggunakan When Expression
 * Dengan menggunakan sealed class kita bisa membatasu hanya class turunannya yang perlu di check
 */

fun main() {

    println(operation(10, 20, Plus()))
    println(operation(2, 1, Minus()))

}

// Sealed Class (Parent)
sealed class Operation(val name: String){
}

// Child
class Plus : Operation("Plus")

class Minus : Operation("Minus")


fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}