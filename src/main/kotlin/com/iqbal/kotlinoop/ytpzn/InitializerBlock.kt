package com.iqbal.kotlinoop.ytpzn

/**
 * Initializer Block adalah blok kode yang akan dieksekusi ketika constructor dipanggil
 * Kita bisa memasukan kode program di dalam Initializer Block
 */

fun main() {
    // Buat Objek 1
    val avanza = InitializerBlock("Toyota")
    println("Mobil merek ${avanza.brand} dibuat tahun ${avanza.year}")

    println()

    // Buat Objek 2 (Kita ubah default value constructor year
    val xenia = InitializerBlock("Daihatsu")
    xenia.year = 2021
    println("Mobil merek ${xenia.brand} dibuat tahun ${xenia.year}")

}

class InitializerBlock(paramBrand: String, paramYear: Int = 2023) {

    init {
        println("Car $paramBrand dibuat")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}
