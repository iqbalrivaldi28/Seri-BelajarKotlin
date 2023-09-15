package com.iqbal.kotlinoop.ytpzn

/**
 * Inner Class adalah Class didalam Class
 * Class didalamnya adalah Inner Class dan di luarnya adalah Outer Class
 *
 * Agar kelass yang dialam bisa mengakses data yang ada di kelas di luar, gunakan kata kunci Inner
 */

fun main() {

    // Kita Buat objek Boss dulu baru bisa buat objek employenya
    val boss1 = Boss("Iqbal")
    val employee1 = boss1.Employee("Budi")
    val employee2 = boss1.Employee("Jeje")

    val boss2 = Boss("Naisa")
    val employee3 = boss2.Employee("Syahna")
    val employee4 = boss2.Employee("Hanan")

    val emplyee = Employee("Hans")   // Gini ngak bisa (buat objek untuk outer class nya dulu baru objek inner classnya)
    println("My name $emplyee")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}

class Boss(val name: String) {

    // Inner Class
    inner class Employee(val name: String){
        fun hi(){
            println("Hi, i'm, $name, My boss is ${this@Boss.name}")
        }
    }

}