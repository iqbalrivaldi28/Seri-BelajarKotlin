package com.iqbal.kotlinoop.ytpzn

/**
 * Selain extention function, di Kotlin kita juga bisa pake Extension Properties
 * Untuk membutanya kita bisa embuat properties Getter dan Setter
 */

fun main() {
    val student2 = Student2("Kiki", 13)
    student2.sayHello("Jeje")

    // Extensio Properties
    println(student2.upperName)
}


class Student2(val name: String, val age: Int)

    // Extension Functionnya
    fun Student2.sayHello(name: String) {
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }

    // Extension Priperties
    val Student2.upperName: String
        get() = this.name.toUpperCase()
