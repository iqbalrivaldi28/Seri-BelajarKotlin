package com.iqbal.kotlinoop.ytpzn

/**
 * Function Overriding adalah kemampuan membuat ulang function yang sudah ada di Class Parent
 * Agar function yang class Parent bisa di overriding harus tambahkan kata kunvi "Open" sebelum nama Class
 */

fun main() {

    val objek1 = Pegawai("Boy")
    objek1.salamPagi("Roy")

    val objek2 = Manajer("Iqbal")
    objek2.salamPagi("Lili")

}

// Parent Class
open class Pegawai(val name: String){

    open fun salamPagi(name: String){
        println("Selamat pagi $name, nama saya ${this.name}")
    }

}

// Child Class
open class Manajer(name: String) : Pegawai(name){

    // Kita Ovveride funsi di Parent class ke Child Class
     override fun salamPagi(name: String) {
       println("Hello $name, my name is manager ${this.name}")
    }

}

class SuperManager(name: String) : Manajer(name) {
    override fun salamPagi(name: String) {
        println("Hello $name, my name is super manager ${this.name}")
    }
}