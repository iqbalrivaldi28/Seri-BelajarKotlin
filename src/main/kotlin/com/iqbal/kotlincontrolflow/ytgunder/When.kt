package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    whenExampleOne()

    // menyimpan when expression ke dalam variabel
    whenExampleTwo()

    // jika ingin mencetak keterangan when lebih dari baris
    whenExpressionThree()
}

fun whenExampleOne(){
    val value = 7
    when(value) {
        5-> println("value is 5")
        6-> println("value is 6")
        7-> println("value is 7")
        else -> println("value can't be reached")
    }
}


// kita taro when nya didalam variabel
fun whenExampleTwo() {
    print("Masukan angka 1-3: ")
    val number = readLine()?.toIntOrNull() ?:0

    val result = when(number){
        1 -> println("Kamu memasukan angka $number")
        2 -> println("Kamu memasukan angka $number")
        3 -> println("Kamu memasukan angka $number")
        else -> println("Angka yang kamu inputkan salah")
    }

    println(result)
}


// jika ingin mencetak keterangan when lebih dari baris
fun whenExpressionThree() {
    val value = 7
    val valueOfString = when (value){
        5 -> {
            println("value is $value")
            "5"
        }

        6 -> {
            println("value is $value")
            "6"
        }

        7 -> {
            println("value is $value")
            "7"
        }

        else -> {
            println("nilai tidak dijangkau")
            "error"
        }
    }

    println(valueOfString)
}










