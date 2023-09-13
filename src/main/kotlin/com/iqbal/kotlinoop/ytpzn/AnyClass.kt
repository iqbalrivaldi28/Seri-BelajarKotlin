package com.iqbal.kotlinoop.ytpzn

/**
 *  Di Kotlin semua class yang kita buat tanpa Parent Class maka akan secara otomatis dia menjadi Child Class Any
 *  Any adalah Supercalss unuk semua class yang ada di kotlin
 *  Function bawaan Any toString(), hashCode() dan equals()
 */

fun main() {
    val laptop = Laptop("Acer")
    println(laptop.toString())  // Function toString () bawaah kelas Any
    println(laptop.hashCode())  // Function hashCode () bawaah kelas Any
    //println(laptop.equals())  // Function equals () bawaah kelas Any

    val smartphone = Smartphone("Redmi")
    println(smartphone.brand)
}

class AnyClass {  // => karena ngak extend ke kelas lain maka secara otomatis dia extend ke Any()

}

class Laptop(val brand: String) // => : Any()

class Smartphone(val brand: String) // => : Any()