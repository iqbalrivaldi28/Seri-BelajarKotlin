package com.iqbal.kotlincontrolflow.ytgunder

fun main() {

    // Gaya Penulisan Pertama
    exampleRange()

    println()

    // Gaya Penulisan Kedua
    exampleRangeTwo()

    println()


    // Penggunaan STEP pada Range
    exampleRangeThree()

    println()

    // Hitung Mundur Pada Range
    exampleRangeFour()

    println()

    // Hitung Mundur Pada Range
    exampleRangeFive()

}



// Gaya Penulisan Pertama
fun exampleRange(){
    var rangeAngke = 1..10

    rangeAngke.forEach {
        print("$it ")
    }

    /* Penulisan Lambda Function bisa juga kayak ini (ngak pake $it) */
//    rangeAngke.forEach { angka ->
//        print("$angka ")
//    }
}

// Gaya Penulisan Kedua
fun exampleRangeTwo(){
    var rangeAngke = 1.rangeTo(10)

    rangeAngke.forEach {
        print("$it ")
    }
}


// Penggunaan STEP pada Range
fun exampleRangeThree(){
    var rangeAngke = 1..10 step 2

    rangeAngke.forEach {
        print("$it ")
    }
}



// Hitung Mundur Pada Range
fun exampleRangeFour(){
    var rangeAngke = 10 downTo 1

    rangeAngke.forEach {
        print("$it ")
    }
}


// Range pada tipe data Char
fun exampleRangeFive(){
    var rangeAngke = 'A'.rangeTo('J')

    rangeAngke.forEach {
        print("$it ")
    }
}