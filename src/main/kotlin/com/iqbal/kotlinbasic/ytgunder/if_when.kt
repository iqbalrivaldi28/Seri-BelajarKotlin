package com.iqbal.kotlinbasic.ytgunder

fun main() {

    ifExpression()

    println()
    println()

    whenExpression()
}

fun ifExpression() {
    val open = 7
    val now = 7

    if (now > open){
        print("Toko sudah buka!")
    } else if(now == open){
        print("Tunggu bentar yaa!")
    } else {
        print("Toko tutup!")
    }
}

fun whenExpression() {
    print("Masukan angka untuk memilih hari: ")
    val day = readLine()?.toIntOrNull() ?:0

    var result = when(day) {
        1 -> "Senin"
        2 -> "Selesa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jum'at"
        6 -> "Sabu"
        7 -> "Minggu"
        else -> "Kamu salah/belum inputkan angka!"
    }

    print(result)
}