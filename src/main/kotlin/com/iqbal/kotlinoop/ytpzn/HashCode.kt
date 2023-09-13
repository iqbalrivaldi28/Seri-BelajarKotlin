package com.iqbal.kotlinoop.ytpzn

/**
 * Hash Code adalah function yang digunakan sebagai representasi angka unit untuk objek yang kita buat
 */

fun main() {
    val company1 = Company("Iqbal")
    val company2 = Company("Iqbal")

    println(company1)
    println(company2)
    println(company1.hashCode() == company2.hashCode())

    class hasCode(val name: String) {

    }
}