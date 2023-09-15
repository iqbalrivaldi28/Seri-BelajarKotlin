package com.iqbal.kotlinoop.ytpzn

/**
 * Anonynous Class memnungkinkan kita untuk membuat objek daru class yang belum lengkap
 */

fun main() {
    // Anonymous function dimana kita pake kata kunci objet kayak ini diikuti dengan nama interfacenya
    fireAction(object : Action {
        override fun action() {
            println("Action One")
        }
    })

    fireAction(object : Action {
        override fun action() =println("Action Two")   // Bisa juga peka Inline Function
    })

}

interface Action {
    fun action()
}

fun fireAction(action: Action){
    action.action()
}