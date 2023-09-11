package com.iqbal.kotlinoop.ytpzn

/**
 * Kotlin mendukung pembuatan constructor lebih dari satu
 * constructor utama disebut Primary Constructor, constructor Tambahan disebu Secondary Constructor
 * Saat membaut secibdry costrucnya kita wajib memanggil primary constructornya
 */

fun main() {
    // Ketika kita buat objek dari kelasnya, kita bisa milih constructor mana yang akan dipake

    // Buat Objek 1 (Pake primary constructor)
    val hrv = SecondaryConstructor("Honda", "HRV", 2023)
    println("Mobil merek ${hrv.brand} dengan nama ${hrv.names} dibuat tahun ${hrv.year}")

    println()

    // Buat Objek 2 (Pake constructor Secindary 1)
    // (Kita ubah default value constructor year)
    val xenia = SecondaryConstructor("Daihatsu", "Xenia")
    xenia.year = 2022
    println("Mobil merek ${xenia.brand} dengan nama ${xenia.names}")

    println()

    // Buat Objek 3 (Pake constructor Secindary 2)
    val avanza = SecondaryConstructor("Toyota")
    println("Mobil merek ${avanza.brand} ")

    println()
    println("=======================================================")
    println(" Contoh Tanpa Penggunaan Primary Constructor ")
    println("=======================================================")
    println()

    // Buat Objek Secondaru Construcor 1
    val address1 = Address("Jalan A", "Jakarta", "Indonesia")
    println("${address1.street} berada di kota ${address1.city} negara ${address1.country}")

    println()

    // Buat Objek Secondaru Construcor 2
    val address2 = Address("Jalan B", "Bogor")
    println("${address1.street} berada di kota ${address2.city}")

    println()

    // Buat Objek Secondaru Construcor 3
    val address3 = Address("Jalan C")
    println("${address3.street}")
}


class SecondaryConstructor(paramBrand: String, paramName: String, paramYear: Int = 2021){

    init{
        println("Car $paramBrand dibuat!")
    }

    // Secondary Constructor
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2021){
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, ""){
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var names: String = paramName
    var year: Int = paramYear

}


// Contoh penerapan Tanpa Primary Constructor

class Address{

    init {
        println("Objek Address dibuat")
    }

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // Secondary Constructor 1
    constructor(paramStreet: String, paramCity: String, paramCountry: String){
        street = paramStreet
        city = paramCity
        country = paramCountry

        println("Secondary Constructor 1 dipanggil!")
    }

    // secondary Constructor 2 (kita panggil constructor secondary 1 disini sipanya opsional / tidak wajib )
    constructor(paramStreet: String, paramCity: String) : this(paramStreet, paramCity, ""){
        println("Secondary Constructor 2 dipanggil!")
    }

    // Secondary Constructor 3 ( Kota juga bisa buat secondary construcnya tanpa pangiil secondaru constructor laiinya )
    constructor(paramStreet: String){
        street = paramStreet
        println("Secondary Constructor 3 dipanggil!")
    }

}