package com.iqbal.kotlinbasic.ytpzn

/*
    Penggunaan return bisa cumannsekali tulis dan di taro di bagian depan if atau when
 */

fun main() {

    fun sayHello(name: String = ""): String {

// Return IF
//        return if (name == ""){
//            "Hello bro!"
//        } else{
//            "Hello $name"
//        }

//  Return When
          return when(name){
            " " -> "Hai Bro!"
            else -> "Hai $name"
        }
    }


    println(sayHello())
    println(sayHello("Iqbal"))
}