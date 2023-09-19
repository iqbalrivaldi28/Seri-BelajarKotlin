package com.iqbal.kotlincontrolflow.ytgunder

fun main() {
    exampleWhile()
    println()
    exampleWhileTwo()
    println()
    exampleWhileThree()
}

fun exampleWhile(){
    var count = 1

    while (count < 5) {
        println("hello kotlin!, ini baris $count")
        count++
    }
}

fun exampleWhileTwo(){
    print("Mulai dari baris berapa 1-5: ")
    var angka = readLine()?.toIntOrNull() ?:6

    if (angka == 0 || angka > 5 ){
        println("Angka yang kami masukan di luar cakupan")
    } else{
        while (angka <= 5){
            println("Ini Baris ke- $angka")
            angka++
        }
    }
}

fun exampleWhileThree(){
    var angka = 1

     while (angka < 10) {

         if (angka % 2 == 0){
             println("Angka $angka adalah Genap")
         } else {
             println("Angka $angka adalah Ganjil")
         }

         angka++
     }
}