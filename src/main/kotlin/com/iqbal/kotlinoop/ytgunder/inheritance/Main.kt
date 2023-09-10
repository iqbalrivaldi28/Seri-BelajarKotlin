package com.iqbal.kotlinoop.ytgunder.inheritance

fun main() {
    // Objek Class Cat
    val catObjek = Cat("Cing-ging", 5, true, "Putih")

    println("Warna dari ${catObjek.name} adalah ${catObjek.color}")
    catObjek.eat()
    catObjek.sleep()
    catObjek.play()

    println()

    // Objek Class Animal
    val animalObjek = Animal("Sapi", 3, false)

    animalObjek.eat()
    animalObjek.sleep()
}