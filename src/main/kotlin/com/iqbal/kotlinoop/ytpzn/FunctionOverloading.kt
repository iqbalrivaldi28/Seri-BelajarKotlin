package com.iqbal.kotlinoop.ytpzn

/**
 * Function overloaing adalah kemampuan membuat function dengna nama yang sama didalam suatu class
 * tetpai untuk harus menggunakan tipe data parameter yang berbeda atau jumlah parameter yang berbeda
 */

fun main() {
    val objek1 = FunctionOverloading("Raisa")

    objek1.sayHello("Iqbal")
    objek1.sayHello("Iqbal", "Rivaldi")
}


class FunctionOverloading(val name: String) {

    fun sayHello(yourName: String){
        println("Helo $name, my name is $yourName")
    }

    fun sayHello(firstName: String, lastName: String){
        println("Hai $firstName $lastName, my name is $name")
    }

}