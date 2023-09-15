package com.iqbal.kotlinoop.ytpzn

/**
 * Enum class adalah representasi dari class yang sudah tetap nilanya
 * conoth data yang sudah tetap seperti jenis kelamin, arah mata angin dan sejenisnya
 *
 * Untuk mmbuat Enum Class kita bisa pake kata kuncu Enum
 * Kita ngak bisa buat objek dari class Enum, tapi kita bisa deklarasikan objcnta langsung di dalam Enum Class tersebut
 *
 * Enum class sama kyak class pada umumnya dimana bisa memiliki Properties dan Function didalanya
 */

fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE

    // Untuk mengambil semua data yang ada di class enum
    val allGenders: Array<Gender> = Gender.values()

    println(man)
    println(women)
    println(allGenders.toList())

    man.printDescription()
    women.printDescription()
}

enum class Gender(val description: String){
    MALE("Deskripsi Male"),
    FEMALE("Desripsi Femaile");

    fun printDescription(){
        println(description)
    }
}