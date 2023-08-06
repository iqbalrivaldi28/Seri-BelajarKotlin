package com.iqbal.kotlinbasic.ytpzn

fun main() {
    // Ketika di panggil harus menambahkan semua parameter yang ada pada fungsinya
    exampleFunctionParameter("Lee","Minho", 36)


}

fun exampleFunctionParameter(firstName: String, lastName: String, age: Int){
    println("""
        First Name: $firstName
        Last Name: $lastName
        Age: $age
    """.trimIndent())
}