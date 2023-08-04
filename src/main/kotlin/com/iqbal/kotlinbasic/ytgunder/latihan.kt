package com.iqbal.kotlinbasic.ytgunder


fun main() {
    name()
}

fun name(){
    print("Masukan nama kamu: ")
    var name = readLine()?:0

    var nameLength= name.toString().length

    print("Nama kamu adalah $name dan panjang karekter $nameLength")
}