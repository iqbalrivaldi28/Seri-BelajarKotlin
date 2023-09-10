package com.iqbal.kotlinoop.ytgunder.inheritance

class Cat( name: String,  age: Int,  isCarvivora: Boolean, var color: String): Animal(name, age, isCarvivora) {

    override fun eat(){
        println("$name is eat now")
    }

    override fun sleep(){
        println("$name sleep after eat")
    }

    fun play(){
        println("$name play after sleep")
    }
}