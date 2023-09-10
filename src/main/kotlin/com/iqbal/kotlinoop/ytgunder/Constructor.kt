package com.iqbal.kotlinoop.ytgunder

/**
 * Komentar Multi Baris
 * Biasanaya di pake di luar function
 */

fun main() {
    val carToyota = Car(4,"White", false)
    println("Mobil Inova dengan jumlah Ban ${carToyota.tire}, warna ${carToyota.color} da apakah listrik = ${carToyota.isElectric}")

    val carDaihatsu = Car(4,"Hitam", false, true)
    println("Mobil Xenia dengan jumlah Ban ${carToyota.tire}, warna ${carToyota.color} da apakah listrik = ${carToyota.isElectric}, apakah Disel ${carDaihatsu.isDisel}")

}


// Primary Constroctor
class Car( pTire: Int,  pColor: String,  pIsEledtric: Boolean){
    val tire: Int
    val color: String
    val isElectric: Boolean
    var isDisel: Boolean

    init {
        tire = pTire
        color = pColor
        isElectric = pIsEledtric
        this.isDisel = false
    }

    // Secondary Constroctor
    constructor(pTire: Int,  pColor: String,  pIsEledtric: Boolean, pisDisel: Boolean): this(pTire, pColor, pIsEledtric){
        this.isDisel = pisDisel
    }

}


