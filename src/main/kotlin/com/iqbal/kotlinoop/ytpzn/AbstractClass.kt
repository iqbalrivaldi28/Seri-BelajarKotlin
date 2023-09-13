package com.iqbal.kotlinoop.ytpzn

/**
 * Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract
 * Abstract class artinya adalah aaalah class tersebut TIDAK BISA dibuat SEBAGAI OBJECT hanya bisa diturunkan
 */

fun main() {

    // Error karena abctract class tidak bisa di bua objek
    // val location = location("")

    val city = City("Bandung")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}

// Abstract Class pake kunci "ABSTRACT" sebelum anam Class
abstract class Location(val name: String) {
}


// Child Class dari kelas Abstract (agar kita bisa akses abstract clas kita haruskan turukan ke child class)
class City(name: String): Location(name){
}

class Country(name: String): Location(name) {
}