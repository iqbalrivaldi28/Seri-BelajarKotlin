package com.iqbal.kotlinoop.ytpzn

/**
 * Ada 4 Visibility Modifier (Public, Private, Protected, Internal)
 *
 * Public = Bisa diakses di semua class
 * Private = Hanya bisa di akses di kelas itu saja
 * Protected = Hanya bisa di akses di kelas itu saja dan kelas turunannya
 * Internal = Hanya bisa di akses diproject itu saja di project lain tidak bisa akses
 */

fun main() {

    // Public
    val publicTeach = Teacher("Koko")
    publicTeach.publicTeach()

    println()

    // Protected
    class ChildTeacher(name: String) : Teacher(name){
       fun test(){
           super.protectedTeach()
       }
    }

    val childTeacher = ChildTeacher("Budi")
    childTeacher.test()

    println()

    // Internal
    val InternalTeach = Teacher("Koko")
    InternalTeach.internalTeach()

}

open class Teacher(val name: String) {

    // Public Otomatis
    fun publicTeach() = println("Public Teach with $name")  // Pake Single Line pada Functionya

    // Private
    private fun privateTeach() = println("Private Tecah with $name")

    // Protected
    protected fun protectedTeach() = println("Protected Teach with $name")

    // Internal
    internal fun internalTeach() = println("Internal Teach with $name")

}