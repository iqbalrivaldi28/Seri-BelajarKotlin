package com.iqbal.kotlinoop.ytpzn

/**
 * Companion Object adalah kemampuan membuat inner object didalam class, tanpa menggunakan nama object
 * Companio Object secara otomatis akan menggunakan nama Companion, atau bisa langsung di akses lewat nama classnya
 *
 */

fun main() {
    // Cara aksesnya  (Ketika nama classnya lalu bisa langsung akses properties dan functionya)
    println(CompanionObject.name)

    CompanionObject.sayHai("M. Iqbal Rivaldi")
}

class CompanionObject {

    companion object{
        var name: String = "Lilie Anggraini"

        fun sayHai(value: String) {
            println("Hai $value, my name is $name")
        }
    }
}