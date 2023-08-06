package com.iqbal.kotlinbasic.ytpzn

fun main() {
    // Pada Function Default Parameter kita ngak wajib isi nilai paramteternya ketika di panggil
    // Default parameter disini ada pada paremter kedua yaitu ( lastName: String = "" )

    ExampleFunctionDefaultParameter("Hannisa")
    println()
    ExampleFunctionDefaultParameter("Hannisa", "Manis")
}


fun ExampleFunctionDefaultParameter(firstName: String, lastName: String = "") {
    println("""
        First Name: $firstName
        Last Name: $lastName  // ini kita kasih defualt parameter jadi ngak wajib di isi ketika di panggil
    """.trimIndent())
}