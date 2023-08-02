package com.iqbal.kotlinbasic.ytgunder

fun main() {
    stringTemplate()
    stringTemplateKedua()
}


fun stringTemplate() {
    val kota = "Bandar Lampung"
    val tahun = 2020

    print("Saya kuliah di kota $kota pada tahun $tahun")
    println()
}

fun stringTemplateKedua() {
    val now = 7

    print("Toko sekarang ${if (now == 7) "Buka" else "Masih tutup!"}")
}
