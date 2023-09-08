package com.iqbal.kotlinbasic.ytpzn

fun main() {
    // contoh satu
    //display(5)

    // Contoh Dua
    var tailRekusif = factorialRecursiveToTail(5)
    println(tailRekusif)


}


// Contoh Satu
tailrec fun display(value: Int){
    println(value)
    if (value > 0){
        display(value - 1)  // rekusive dimana kita panggil function itu sendiri di dalam bodynya
    }
}


// Contoh Dua
tailrec fun factorialRecursiveToTail(value: Int, total: Int =1): Int{
    return when(value) {
        1 -> total
        else -> factorialRecursiveToTail(value - 1, total * value)
    }
}
