package com.iqbal.kotlinoop.ytpzn

/**
 * Super constructor dimana kita bisa akses constructor yang ada di Parent Class nya
 * Ada dua cara untuk akses Constructor parent class di child class
 */

fun main() {
    val premiumCustomer = PremiumCustomer("Iqbal")
    println(premiumCustomer.name)
    println(premiumCustomer.type)
    println(premiumCustomer.balance)

    val executiveCustome = ExecutiveCustome("Naisa")
    println(executiveCustome.name)
    println(executiveCustome.balance)
    println(executiveCustome.type)

}


// Parent Class
open class Customer(val name: String, val type: String, val balance: Long) {

    constructor(name: String, type: String) : this(name, type, 100)

    constructor(name: String) : this(name, "Standar")

}

// Cara akses Constructor pake Super Constructor
// kalau pake "Super" ngak perlu pake construcotr lagi di classnya kayak ini aja " PremiumCustomer"
class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")

    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}


// Ini Cara akses contructor cara biasa
// Dimana kit wajib pake cuntoructor seperti ini "ExecutiveCustome(name: String, balance: Long)" pada kelasnya
class ExecutiveCustome(name: String, balance: Long) : Customer(name, "Executive", balance) {
    constructor(name: String) : this (name, 0)
}