package com.iqbal.kotlinoop.ytgunder

/**
 * Abstract class adalah gambaran umu dari sebuah class
 * Abstract class diawali dengan keyword abstract di depsan sebuah nama class
 * Abstract class tidak langsug bisa di realisaskian menjadi sebuah objek, tapi harus di realisasikan ke class lain dulu
 */

fun main() {

    // Kita buat objek
    val avanza = abstractToyota("Avanza", "Toyota", 4)
    println("Nama mobil adalah ${avanza.name} mereknya ${avanza.merek} dan jumlah roda = ${avanza.jmlRoda}")

    avanza.mesin()
}


abstract class abstractMobil(val name: String, val merek: String, val jmlRoda: Int){
    open fun mesin(){
        println("Mesin mobil $name dihidupkan")
    }


}

class abstractToyota(name: String, merek: String, jmlRoda: Int): abstractMobil(name, merek, jmlRoda){

    override fun mesin(){
        println("Mesin mobil $name di hidupkan")
    }

}

