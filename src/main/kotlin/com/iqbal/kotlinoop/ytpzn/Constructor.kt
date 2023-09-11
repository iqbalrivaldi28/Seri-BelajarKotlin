package com.iqbal.kotlinoop.ytpzn

/**
 * Didalam class kotlin kita bisa buat constructor,
 * constructor mirip seperti function yang akan di panggil saaat pertama kai objek dibuat
 */

fun main() {
    // Ketika buat objek wajib untuk memasukan nilai constructornya
    val objekConstuctor = Constructor("Naisa", "Alifia")

    println(objekConstuctor.firstName)
    println(objekConstuctor.middleName)
    println(objekConstuctor.lastName)
}


// Pada constructor bisa buat juga default valuenya
class Constructor(firtNameParam: String, middleNameParam: String, lastNameParam: String  = "Yuriza") {

    var firstName = firtNameParam
    var middleName = middleNameParam
    var lastName = lastNameParam

}