package com.iqbal.kotlinoop.ytgunder.inheritance

open class Animal(var name: String, var age: Int, var isCarvivora: Boolean){

    open fun eat(){
        println("$name is eat now")
    }

    open fun sleep(){
        println("$name is sleep now")
    }

}