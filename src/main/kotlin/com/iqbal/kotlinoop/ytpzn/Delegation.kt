package com.iqbal.kotlinoop.ytpzn

/**
 * Salah satu Design Pattern lain yang populer adalah Delegation
 * Delegation adalah menerukan properties atau fucntion ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 */

fun main() {
    val base = MyBase()
    base.sayHelloGuys("Lili")
    base.sayHaiGuys("Putri")

    // Delegate Manual
    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHelloGuys("Edo")

    // Delegate Singkat (Otomatis)
    val baseDelegate2 = MyBaseDelegate2(base)
    baseDelegate2.sayHaiGuys("Naisa")
}


interface Base{
    fun sayHelloGuys(name: String)
    fun sayHaiGuys(name: String)
}


class MyBase : Base {
    override fun sayHelloGuys(name: String) {
        println("Hello, $name")
    }

    override fun sayHaiGuys(name: String) {
        println("Hi, $name")
    }
}


// Delegasi Secara Manual
class MyBaseDelegate(val base: Base) : Base {
    override fun sayHelloGuys(name: String) {
        base.sayHelloGuys(name)
    }

    override fun sayHaiGuys(name: String) {
        base.sayHaiGuys(name)
    }
}


// Delegasi Secara Singkat (Otomatis)
class MyBaseDelegate2(val base2: Base) : Base by base2

// Cukup pake "by"