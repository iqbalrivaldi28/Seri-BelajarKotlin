package com.iqbal.kotlinoop.ytpzn

/**
 * Properti itu attibur yang ada di dalam class
 * ketika kita buat objek dari kelas tersebut, kita bisa manipulasi atau ubah kodenya jika verupa var
 */

fun main() {
    var objekProperties = Properties()

    // Kita ubah nilai properti dari kelasnya ketika kita huat objeknya
    objekProperties.firstName = "M."
    objekProperties.middleName = "Iqbal"
    objekProperties.lastName = " Rivaldi"

    println("${objekProperties.firstName}" + "${objekProperties.middleName}" + "${objekProperties.lastName}")
}

class Properties {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}