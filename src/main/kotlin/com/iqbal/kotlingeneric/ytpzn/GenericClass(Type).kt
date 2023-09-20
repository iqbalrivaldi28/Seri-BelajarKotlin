package com.iqbal.kotlingeneric.ytpzn

/**
 * Generic Type adalah class atau interface yang memiliki parameter type
 * Tidak ada ketentuan dalam pebuatan generic parameter type, namun biasanaya kebanyakan orang menggunakan 1 kareakter seperti "T"
 *
 * Parameter di Generic tyoe boleh lebih dari satu
 * Namun harus menggunakan nama type berbeda, contohnya <T, U> atau <T, U, P)
 * Ini sanga berguna ketika kita inign membuat generic parameter type ya g banyak
 *
 * Penulisan Generic Parameter
 * MyData<T, U>
 */

fun main() {

    // Contoh 1
    val objekSatu:MyData<String> = MyData("Iqbal")
    objekSatu.printlnData()

    val objekDua:MyData<Int> = MyData(28)
    objekDua.printlnData()
    println(objekDua.getData())


    // Contoh 2
    val objekTiga:MySecondData<String, Int> = MySecondData("Umur", 13)
    objekTiga.printlnData()

    val objekEmpat:MySecondData<Boolean, Char> = MySecondData(true, 'A')
    objekEmpat.printlnData()

}


// Contoh 1
class MyData<T> (val firstData: T){

    fun getData(): T = firstData

    fun printlnData(){
        println("Data is $firstData")
    }
}

// Contoh 2 (Multiple Parameter type)
class MySecondData<T, U> (val firstData: T, val secondData: U){

    fun printlnData(){
        println("First Data = $firstData and Second Data = $secondData")
    }
}