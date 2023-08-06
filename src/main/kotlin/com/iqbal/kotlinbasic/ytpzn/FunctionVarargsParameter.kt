package com.iqbal.kotlinbasic.ytpzn

/*
    Function varargs adalah fungsi dimana ketika parameternya ada tulisan varagrs berarti parameter tersebut bersifat array,
    varagrs harus di taro ujung sebelah kanan (terakhir)
 */

fun main() {
    var result = hitungTotal("iqbal",10, 10)
    println(result)
    // println("Nama: ${result.first}, Nilainya: ${result.second}")  ( Untuk Mentak kedua nilainya )
}


fun hitungTotal(name: String, vararg values:Int): Int {
    var total = 0

    for (i in values){
        total += i
    }

    return total
}

/* INI UNTUK MNCATK KEDUA NILAI PARAMATERNYA, KITA Pair<String, Int>
fun hitungTotal(name: String, vararg values:Int): Pair<String, Int> {
    var total = 0

    for (i in values){
        total += i
    }

    return Pair(name, total) // Pair
}

 */


