package com.iqbal.kotlinoop.ytpzn

/**
 * Data Class adalah class yang secara otomatis akan membuatkan funcition equals, hascode toString
 * dan copy dari semua peroperties yang dimiliki oleh Data Class
 *
 * Data Class memiliki function copy yang bisa digunakan untuk menduplikasi objek
 * bahkan metode copy ini digunakan untuk menduplikasi dan mengubah propertiesnya
 */

fun main() {
    val product1 = Product("Indomie", 2500, "Food")
    println(product1)

    // Function Copy ( Duplikat Objek Product dan juga Rubah Datanya)
    // Untuk rubah isinya datanya pake Named Argument
    val product2 = product1.copy(name = "Supermie", category = "Mie Instant")
    println(product2)
}


data class Product(
    var name: String,
    val price: Int,
    val category: String
)