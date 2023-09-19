package com.iqbal.kotlinoop.ytpzn

/**
 * Polymorphism berasal dari bahsa yunai yang berati banyak bentuk
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah menjadi bentuk lan
 * Polymorphism erat hubungannya dengan Inherintace (Pewarisan)
 */

fun main() {
    var employee = Employee("Iqbal")
    employee.sayHello("Naisa")

    // Perubahan Bentuk (Polymophism)
    employee = Manager("Iqbal")
    employee.sayHello("Naisa")

    employee = VicePresident("Iqbal")
    employee.sayHello("Naisa")


    // Dimana kita ubah yang tadinya employee dari object employe ke manajer kemudian ke vice president
}

