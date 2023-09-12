package com.iqbal.kotlinoop.ytpzn

/**
 * Super Keyqord digunakan untuk mengakses properties atau function milik Parent Class
 */

fun main() {

    // Objek Parent Class
    val objekSuperKey = SuperKeyword()
    println("Super Corner = ${objekSuperKey.corner}")
    objekSuperKey.printName()

    println()

    // Objek Child Class
    val objekChild = ChildSuperKeyword()
    println("Child Corner = ${objekChild.corner} dan Parent corner = ${objekChild.parentCorner}")

    objekChild.printName()
}

// SUPER PROPERTIES

// Parent Class
open class SuperKeyword {
    open val corner: Int = 3

    open fun printName(){
        println("This ini Parent Class")
    }
}

// Child Class
class ChildSuperKeyword : SuperKeyword() {
    override val corner: Int = 10

    // Super keyword dimana kita akan ngambil properties di Parent Class
    val parentCorner = super.corner


    override fun printName() {
        println("This is Child Class")
        super.printName()   // Kita akses function yang ada di Parent Class nya
    }
}



