package com.iqbal.kotlinoop.ytpzn

/**
 * Deklarasi didalam kotlin tidak hanya dalam bentuk Cass, ada juga Interface
 * Interface adalah blueprint, prototype atau cetakan di Kotlin
 *
 * Interface tidak bisa langsung dibuat sebagai objek
 * Interface hanya bisa diturunkan dan bisanaya digunakan sebagai kontrak untuk class turunannya
 *
 * Secara stabdar semua properties dan function yang ada di interfcae adalah abstract (Jadi child nya harus oveeride)
 *
 * Di Interface sebuah class Child bisa memiliki banyak Interface Parent
 */

fun main() {
    val human = Human("Iqbal")
    human.sayHello("Eko")

    println()

    val human2 = Human("Joko")
    human2.sayHai("Budi")

    println()

    val human3 = Human("Jose")
    human3.go()

    println()

    val human4 = Human("Budi")
    human4.move()
}

// Parent Interface
interface Interaction{
    val name: String
    fun sayHello(name: String)

    // Bisa juga pake Function Konkret di Interface (menuliskan isi bodynya langung)
    fun sayHai(name: String){
        println("Hai $name, my name is ${this.name}")
    }
}

// Multiple Interface
interface Go {
    fun go(){
        println("Go!")
    }
}


// Inheritance antar Interface (Bisa)
// kayak interface Go : Human {  }


// Memperbaiki Konflik di Interface (Coontoh ada 2 Interface yang memiliki nama Function yang sama
interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}


// Child Class
class Human(override val name: String) : Interaction, Go, MoveA, MoveB{
    override fun sayHello(name: String) {
        println("Hallo $name, my name is ${this.name}")
    }

    // Kalau mau manggil Super Class (Fucntion move di parent interface)
    // pake cara ini kalau ada nama function yang sama
    override fun move() {
        println("Move Human")

        // Panggil Super Interface
        super<MoveA>.move()
        super<MoveB>.move()
    }




    // Function konkret di Interface ngak wajib di Inheritance di child class
    // Jadi ngak perlu override function sayHai()
}