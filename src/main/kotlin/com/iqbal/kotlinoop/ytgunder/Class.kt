package com.iqbal.kotlinoop.ytgunder


fun main() {
    // Kita Inisialiaasi dengan dimasukan kedalam sebuah variabel/objek
    val kucing = Animal("Kucing Cing-cing", 5)


    // Memanggil fungsi Eat dan Age dari objek kucing
    kucing.Eat()
    kucing.Age()
}


class Animal(val name: String, val Age: Int) {

    fun Eat(){
        println("Nama hewan perliharaan saya dalah $name")
    }

    fun Age(){
        println("Usia hewan perliharaan saya adalah $Age tahun")
    }
}