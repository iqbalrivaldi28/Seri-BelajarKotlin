package com.iqbal.kotlinoop.ytpzn

/**
 * Dengan membuat properties di parameter kita ngak perlu lagi buat properties yang sama didalam kelasnya
 * untuk penggunan properties constructor hanya bisa digunakan di primary constructor saja
 */

fun main() {

    // Kita buat objek kelasnya
    val user1 = PropertiesConstructor("Naisa", "cantik")
    user1.password = "sangatcantik"
    println("username = ${user1.username} \npassword = ${user1.password}")

}


// Kita buat properties constructor dengna menggunkana kata kunvi "Var" atau "Val" pada constructornya
class PropertiesConstructor(var username: String, var password: String) {

    // Disini kalau kita pake properties constructor ngak perlu buat lagi properties di dalam kelasnya
    //var username = username

}