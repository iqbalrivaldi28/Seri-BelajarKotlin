package com.iqbal.kotlinoop.ytpzn

/**
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * dalam artian terdapat Parent dan Child Class
 * Di Kotlin satu Parent bisa punya banyak Child, tapi Child cuman bisa satu Parent
 * untuk membuat Inheritance Class kita pelru kata kunci "Open" sebelum anam class agar bisa di wariskan
 */

fun main() {
    val manager = Manager("Iqbal")
    manager.sayHello("Eko")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}

// Parent Class
open class Employee(val name: String) {
    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

// Child Class 1
class Manager(name: String) : Employee(name){

}

// Child Class 2
class VicePresident(name: String) : Employee(name){

}

