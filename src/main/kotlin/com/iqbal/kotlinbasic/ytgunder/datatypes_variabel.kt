package com.iqbal.kotlinbasic.ytgunder

fun main(){
    val campus = "Polinela "
    var kota = "Bandar Lampung"

    println( campus + kota)

    println( "Saya besekolah di $campus, yang berada di kota $kota ") // pake string interpolation
    println()


    // kita panggil fungsi aritmatika
    println("Ini adalah hasil dari fungsi aritmaika")
    aritmatika()


    println()
    println()


    // kita panggil fungsi aritmatikaInput
    println("Fungsi aritmaika Input Number") // input sendiri nilainya
    aritmatikaInputNumber()
}


fun aritmatika() {
    val angkaSatu = 5
    val angkaDua = 2

    print( angkaSatu + angkaDua)
}


fun aritmatikaInputNumber(){

    print("Masukan Angka Pertama : ")
    val angkaPertama = readLine()?.toIntOrNull() ?:0  // Menggunakan elvis operator untuk mengatasi nilai null

    print("Masukan Angka Kedua : ")
    val angkaKedua = readLine()?.toIntOrNull() ?:0  // Menggunakan elvis operator untuk mengatasi nilai null

    val penjumlahan = angkaPertama + angkaKedua

    println("Angka pertama yang kamu inpukan adalah = $angkaPertama dan angka kedua adalah = $angkaKedua")
    println("Jika dijumlahkan maka hasilnya adalah $penjumlahan")


    /*
    Ket:

    Pada bagian deklasrasi variabel kita pake NullPointerException, konvert toInt dan Elvis Operator

    val angkaPertama = readLine()?.toInt() ?:0

    ?.             = NullPointerException
    toInt()        = karena nilai inputan berupa String jadi harus kita convert ke Int
    toIntOrNull()  = ini akan merubah String inputkan jadi Angka, kalau berhasil angka akan di tampilkan
                     & kalau gagal akan mengembalikan nilai null dan nilai null ini akan di tangani elvis oprator menjadi angka 0
    ?:0            = elvis operator jika readLine() mengembalikan nilai null, maka nilai default yang digunakan adalah 0.
                     Ini akan mencegah terjadinya error saat melakukan operasi aritmatika.

     */

}