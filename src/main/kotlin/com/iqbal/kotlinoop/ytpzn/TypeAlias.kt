package com.iqbal.kotlinoop.ytpzn

/**
 * Kotlin mendukung Type Alias
 * Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
 * Biasanaya digunakan ketika ada tipe data yang sama atau untuk mempersingkat penulisan nama tipe data
 */

// Kita mempersingkat penulisan classnya
typealias App = Aplications

fun main() {
    val app = App("Android")
    println("Nama Aplikasi: $app")

    sayHellos { "Iqbal" }
}

// Type Alias untuk Class
class Aplications (val name: String) {
}

// Type Alias unuk Function (Diama parameter Lambdanya kita ubah ke Type Alias agar lebih singkat

typealias StringSupplier = () -> String

fun sayHellos(supplier: StringSupplier){
    println("Hello ${supplier()}")
}







