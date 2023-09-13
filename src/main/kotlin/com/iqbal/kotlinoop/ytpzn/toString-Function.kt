package com.iqbal.kotlinoop.ytpzn

/**
 * toString() adalah function yang digunakan untuk memberitahu representasi String dari Object
 */

fun main() {
    var user = toString("Balee")
    println(user)
}


class toString(var userName: String) {
    override fun toString(): String {
        return "Username is $userName"
    }
}