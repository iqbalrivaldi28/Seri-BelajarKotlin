package com.iqbal.kotlinoop.ytpzn

/**
 * Extension Function adalah menmabhakan function pada tipe data tertentu
 *
 * Extension function bukanlah function dalam class
 * dia ngak bisa akses data yang diftanya private dan protected
 */

fun main() {
    val student = Student("Eko", 20)
    student.sayGoodBye("Budi")           // Pada objeknya kita bisa panggil extension functionya
}


class Student(val name: String, val age: Int)

// Extension Functionnya
fun Student.sayGoodBye(name: String) {
    println("Hello $name, my name is ${this.name} and my age is ${this.age}")
}