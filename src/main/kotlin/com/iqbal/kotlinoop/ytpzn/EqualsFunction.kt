package com.iqbal.kotlinoop.ytpzn

/**
 * Unutk membandingkan menggunakna operator == Ddan !=
 */


fun main() {
    val company1 = Company("Iqbal")
    val company2 = Company("Iqbal")

    println(company1 == company2) // False hasil dari perbadingannya karena beda objek
    println(company1 == company1) // True karena sama objeknya
}

class Company(val name: String) {

}