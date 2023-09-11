package com.iqbal.kotlinoop.ytpzn

/**
 * Selain Membuat uang function di class Child, Kotlin juga bisa membuat ulang Properties
 * untuk Overide kita harus tambahkan kata kunci "Open" di depan proeprties
 */

fun main() {
    val shape = PropertiesOverriding()
    println(shape.corner)

    val shape2 = childSatu()
    println(shape2.corner)

    val shape3 = childDua()
    println(shape3.corner)
}

open class PropertiesOverriding {
    open val corner: Int = 1
}

class childSatu : PropertiesOverriding(){
    override val corner: Int = 4
}

class childDua : PropertiesOverriding(){
    override val corner: Int = 2
}