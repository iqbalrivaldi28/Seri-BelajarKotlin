package com.iqbal.kotlinoop.ytpzn

/**
 * Selain properties/parameter kita juga bisa mendeklarasikan function didalam class
 */

fun main() {

    val objek1 = Function("Raisa")
    objek1.name = "Iqbal"
    objek1.lastName = "Rivaldi"

    objek1.sayHello("Raisa")

    // Karena Function GetFullName itu ada Return jadi haruns ditampung ke variabel baru di cetak
    val fullName = objek1.getFullName()
    println(fullName)

    // atau bisa juga langsung cetak
    print(objek1.getFullName())

}

class Function(var name: String) {

    var lastName: String = ""

    fun sayHello(yourName: String){
        println("Hello $name, my name is $yourName" )
    }

    fun getFullName(): String {
        return "$name $lastName"
    }
}