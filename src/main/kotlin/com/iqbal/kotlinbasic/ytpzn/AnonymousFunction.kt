package com.iqbal.kotlinbasic.ytpzn

fun main() {

    // Pake Lambda di transformer
    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransfor = transformer(name)
        return "Hello $nameTransfor"
    }


    // Pake Anonymous Function karena di kata fun tidak ada nama functionya
    val upper = fun (value: String): String {
        if (value == ""){
            return "UPS"
        }else {
            return value.toUpperCase()
        }
    }


    // Kita panggil
    println(hello("Iqbal", upper))
    println(hello("", upper))
}


