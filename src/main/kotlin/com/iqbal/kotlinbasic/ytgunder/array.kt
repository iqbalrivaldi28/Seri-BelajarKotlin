package com.iqbal.kotlinbasic.ytgunder

fun main() {

    arrayKesatu()
    arrayKedua()
    arrayKetiga()
    arrayKeempat()

}



// Array ( tipe data berbeda di parameternya )
fun arrayKesatu() {
    val dataAray = arrayOf(1, "dua", 3.0, false)
    print(dataAray[2])
    println()
}


// Array Primitif ( satu tipe data saja menyimpan datanya )
fun arrayKedua() {
    val dataArrayPrimitive = intArrayOf(70, 80, 90, 100)

    print("Masukan angka 0-4 saja: ")
    val angka = readLine()?.toIntOrNull() ?: 4

    when(angka) {
        0 -> println("Angka yang diinput $angka, Kamu dapat nilai : ${dataArrayPrimitive[0]}")
        1 -> println("Angka yang diinput $angka, Kamu dapat nilai : ${dataArrayPrimitive[1]}")
        2 -> println("Angka yang diinput $angka, Kamu dapat nilai : ${dataArrayPrimitive[2]}")
        3 -> println("Angka yang diinput $angka, Kamu dapat nilai : ${dataArrayPrimitive[3]}")
        else -> println("Angka yang kamu masukan salah!")
    }
}

// Get() dan Set() pada array
fun arrayKetiga() {
    val dataArray = arrayOf("Polinela, ", "Unila, ", "Itera, ", "Teknokrat")

    dataArray.forEach { data ->
        print(data)
    }
        println()

    // Get () ambil data
    println(dataArray.get(0))
    println(dataArray[3])

    // Set () memasukan dan replace data
    dataArray.set(1, "Unsri, ")  // cara penulisan 1
    dataArray[2] = "Polije, "   // cara penulisan 2

    dataArray.forEach { data ->
        print(data)
    }

    println()
}


// Cara mendapatkan ukuran atau size array
fun arrayKeempat() {
    val arraySize = arrayOf("Satu ", 2.9 , true)

    println("Panjang array adalah ${arraySize.size}") // untuk dapatkan penjang array

    arraySize.forEach { data ->      // untuk cetak isi arraynya pake for each
        print(data)
    }
}