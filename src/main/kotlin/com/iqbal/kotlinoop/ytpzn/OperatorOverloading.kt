package com.iqbal.kotlinoop.ytpzn

/**
 * Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator materimaka dll
 * Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data integer
 * Ada banyak sekali operator yang bisa di ovveride di kotlin
 *
 * Untuk membuat operator overloading, kita bisa menggunakan kata kunci "operator" sebelum deklarasi function nya
 */

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(70)
    val fruit3 = fruit1 + fruit2
    println(fruit3)

    println(fruit3 - fruit1)

}


data class Fruit(val quantity: Int){
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit((this.quantity + fruit.quantity))
    }

    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(this.quantity - fruit.quantity)
    }

}