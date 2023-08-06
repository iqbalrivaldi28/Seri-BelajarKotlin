package com.iqbal.kotlinbasic.ytpzn

/*
    Kita bisa ketika menaggil dan mengisi nilai parameter dengan urutan yang bebas,
    asalkan kita menggunakan named argument
    named argument itu  yang ini (  lastName = "Putri", )
 */

fun main() {
    FunctionNamedArgument(
        lastName = "Putri",  // named argument
        address = "Sukarame",
        firstName = "Kartika",
    )
}


fun  FunctionNamedArgument(firstName: String, lastName: String, address: String){
    println("$firstName, $lastName, $address")
}