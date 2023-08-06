package com.iqbal.kotlinoop

/*
    Pada contoh pertama OOP kita akan menerapkannya pada:

    Car sebagai class,
    Ban, Pintu dan Mesin sebagai atribut atau pratameter,
    Start dan stop sebagai function (method)

 */

fun main(){
    // Kita buat objek dari kelas kenalanOOP
    var objectKenalanOOP = kenalanOOP("4","4","honda")

    // Memanggil fungsi atau properti pada objek
    println("Jumlah ban pada mobil saya adalah ${objectKenalanOOP.ban}")
    println("Jumlah pintu pada mobil saya adalah ${objectKenalanOOP.pintu}")
    println("Mobil saya namanya HRV dengan merk mesin dari ${objectKenalanOOP.mesin}")

    objectKenalanOOP.startMesin()
    objectKenalanOOP.stopMesin()

}

class kenalanOOP(val ban: String, val pintu: String, val mesin: String) {

    fun startMesin(){
        println("$mesin di hidupkan")
    }

    fun stopMesin(){
        println("$mesin dimatikan")
    }

    fun openPintu(){
        println("$pintu di buka")
    }

}