package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue =  Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    println()

    // Abstract Fungsi
    val colorAbstract = abstractClass.GREEN.printValue()

    println(colorAbstract)

    println()

    // Array pada enum class ( ngambil isi datanya )
    val colorArray: Array<Color> = Color.values()
    colorArray.forEach { color ->
        println(color)
    }

    println()

    // Penggunaan When
    when(Color.BLUE){
        Color.BLUE -> println("Color Is Blue")
        Color.BLUE -> println("Color Is Blue")
        Color.BLUE -> println("Color Is Blue")
        else -> println("Color is unfined")
    }

    println()

    // Modisikasi when pake inputan
    print("Masukan Angka 1-3: ")
    val number = readLine()?.toIntOrNull() ?:0

    when(number) {
        0 -> println("Kamu belum inputin angkanya")
        1 -> println("Angka yang kamu inptukan adalah $number dan kamu pilih warna $colorRed")
        2 -> println("Angka yang kamu inptukan adalah $number dan kamu pilih warna $colorGreen")
        3 -> println("Angka yang kamu inptukan adalah $number dan kamu pilih warna $colorBlue")
        else -> println("Harap inputkan angka 1-3 saja")
    }

}


enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0xFF1000),
    BLUE(0xFF0200)

}


enum class abstractClass(val  value: Int){
    RED(0xFF0000){
        override fun printValue() {
            println("Color RED is value $value")
        }
    },
    GREEN(0xFF1000){
        override fun printValue() {
            println("Color Green is value $value")
        }
    },
    BLUE(0xFF0200){
        override fun printValue() {                 // diisni kita ovveride fungsinya
           println("Color Blue is value $value")
        }
    };


    abstract fun printValue() // abstrak fungsi
}







