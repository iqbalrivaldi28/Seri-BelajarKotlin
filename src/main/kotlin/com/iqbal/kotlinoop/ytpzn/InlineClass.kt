package com.iqbal.kotlinoop.ytpzn

/**
 * Kadang kita hanya membuat class dengan satu properties
 * Terlalu banyak class akan memakan konsumsi penggunaan memory
 * Kotlin memiliki kemampuan untuk mengubah clas menjadi inline dengan mneggunakan kata kunci "inline"
 *
 * Inline class hanyak untuk class yang punya satu properties
 */


fun main() {
    val token = InlineClass("Ini Token")
    println(token.value)
    println(token.toUpper())
}

// Inline Class
inline class InlineClass(val value: String) {
    fun toUpper() = value.toUpperCase()   // Singleline Function
}

