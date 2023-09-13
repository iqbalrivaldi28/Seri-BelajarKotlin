package com.iqbal.kotlinoop.ytpzn

/**
 * Late ini kita bisa membuat properties tanpa harus langsung mengisi datanya
 */


fun main() {

//   var television = Television()
//    println(television.brand)    ( kalau langsun cetak gini error karena datanya masih kosong/ belum kita isi)

    // Cara 1 panggil functionya
    var television = Television()
    television.initInisialisasi("Samsung")   // panggil function dulu
    println(television.brand)

    // Cara 2 langsung inisialisasi saja
    var television2 = Television()
    television2.brand = "Panasonic"
    println(television2.brand)
}


class Television {
    lateinit var brand: String

    fun initInisialisasi(brand: String){
        this.brand = brand                  // this.brand = kit panggil properties lateinit di lcass lalu diisni dengan parameter classnya yaiotu brand
    }

}