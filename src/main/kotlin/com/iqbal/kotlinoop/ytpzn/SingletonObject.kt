package com.iqbal.kotlinoop.ytpzn

/**
 * Singleton Object adalah salah satu Design Pattern yang populer
 * Singleton object adalah object yang hanya di buat satu kali
 *
 * Untuk mmebuat singleton gunakan kata kunci "Object" lalu namanya. Sana kayak buat class biasa
 * Singleton juga bisa extends class ataupun interface
 * Namun Singleton tidak bisa memiliki contructor
 */

fun main() {

    // Untuk akssnya sangat mudah (masukan nama singleton saja iikuti tanda titik ".")
    println(SingletonObject.name)
    println(SingletonObject.toUpperCase("lili"))

    // Uuntuk ubah isi datanya
    SingletonObject.name = "M. Iqbal Rivaldi"
    println(SingletonObject.name)


    // INNER SINGLETON OBJECT
    println(Application.Utilities.toUpperCase("Naisa"))

}

// Kita buat Singleton Object (Didalamnya bisa ada properties dan function juga)
object SingletonObject{
    var name: String = "Iqbal"

    fun toUpperCase(value: String): String {
        return value.toUpperCase()
    }
}

/**
 * Inner Object
 * Dimana Singleton objec bisa dibuat didalam sebuah class
 * Namun berbeda dengna inner class, sigleton object tidak bisa mengakses properties atau function di outer classnya
 */

class Application(val name: String) {

    // Singleton Objeknya
    object Utilities{
        fun toUpperCase(name: String): String{
            return name.toUpperCase()
        }
    }

}



