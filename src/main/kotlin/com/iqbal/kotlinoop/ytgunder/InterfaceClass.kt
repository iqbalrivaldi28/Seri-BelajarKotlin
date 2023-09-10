package com.iqbal.kotlinoop.ytgunder

/**
 * Interface adalah gambaran umm dari sebuah kelass yang akan di implementasikan oleh suatu kelas yang lain
 * Cirinya adalah:
 * 1) Hanya beriskna property tanpa inisialisasi
 * 2) Fungsi tanpa return atau belum ada isinya
 * 3) Penamaanya sebaiknya menggunakan awalan huruf "i" seperti "IRun" sebagai best practice nya
 */

fun main() {
    val simba = Lion("Simba")
    simba.sleep()
}

// Interfacenya
interface IRun{
    val name: String
    fun sleep()
}

// Kita buat class yang akan menginheritance Interfacenya
class Lion(override val name: String) :IRun {
    override fun sleep() {
        println("$name is sleep now!")
    }
}

