package com.iqbal.kotlincontrolflow.ytgunder

fun main() {

    exampleOne()

    println()

    // expression di dalam expression
    val result = exampleTwo(2,5)  /* iketika memagil expression di dalam expression harus kita tampung dalam variabel baru di cetak */
    println(result)

}

fun exampleOne(){
    val open = 4    /* ini adalah stament karena tidak mengembalikan nilai */
    val now = 7

    val store = if (now > open) "Toko Buka!" else "Tuku Tutup"   /* ini adalah expressions karena mengembalikan nilai */
    println(store)
}

// expression di dalam expression
fun exampleTwo(angkaSatu: Int, angkaDua: Int): Int {
    return angkaSatu + angkaDua

}

// bisa juga penulisannya seperti ini
// fun exampleTwo(angkaSatu: Int, angkaDua: Int) = angkaSatu + angkaDua
