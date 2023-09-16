package com.iqbal.kotlinoop.ytpzn

/**
 * Salah satu delegation properties yang sudah disediakan Kotlin adalah Lazy Properties
 * Lazy adalah  standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
 */


fun main() {
    val lazy = LazyProperties()
    println(lazy.name)

    val lazy2 = Account() // Cuman dipanggi sekali
    println(lazy2.account)
    println(lazy2.account)
}

// Disini properties namenya berupa Lazy cukup dengan menambahkan keyword lazy pada propertiesnya
// dimana properties "name" berupa lazy dengan memiliki parameter berupa "lambda"
// syaratnya adalah properties terakhir pada properties "lambda" harus memiliki tipe data sama dengan properties diatasnya
// contohnya properties "name" berupa "String" jadi parameter terakhir harus berupa "string juga"

class LazyProperties {
    val name: String by lazy {
        println("Lazy Call")
        "eko"
    }
}

// Contoh 2 Delegasi Properties menggunakan Lazy
class Account {
    val account: Int by lazy {
        println("Ini objek delegasi properties account") //  Cuman di panggil sekali
        123
    }
}