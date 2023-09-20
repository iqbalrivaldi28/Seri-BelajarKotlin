package com.iqbal.kotlingeneric.ytpzn

/**
 * Generic parameter bisa juga kita gunakan pada function
 * Generic Paremeter yang digunakan dalam function, hanya bisa diakses di function tersebut, tidak bisa diakses di luar function
 * Ini cocok jika kita ingin mebuat generic function tanpa mengubah deklarasi class
 */

fun main() {

    // Cara manggilnya
    val genericFunction = GenericFunction("Iqbal")

    genericFunction.sayHelloo("Naisa")         // Bisa Gini Manggilnya
    genericFunction.sayHelloo<String>("Naisa") // Bisa juga gini

    println()

    genericFunction.sayHelloo(10)
    genericFunction.sayHelloo<Int>(10)

    println()

    // Multiple Generic Parameter
    genericFunction.SayHaii<String, String, Int>("Naisa", "Iqbal", 22)

}

class GenericFunction(val name: String) {

    fun <T> sayHelloo(param: T){
        println("Hello $param, my name is ${this.name}")
    }

    // Bisa juga Multiple Generic Parameter
    fun <T, U, P> SayHaii(paramSatu: T, paramDua: U, paramTiga: P){
        println("Hai $paramSatu, my name is $paramDua. My age is $paramTiga")
    }
}
