package com.iqbal.kotlinbasic.ytpzn

fun main() {
  var counter: Int = 0

    // Lambda
  val lambdaIncrement: () -> Unit = {
      println("Lambda Icrement")
      counter++
  }

    // Anonymous Function
    val anonymousIncrement = fun () {
        println("Anonymous Function Increment")
        counter++
    }


    // Function Biasa
    fun functionBiasaIncrement(){
        println("Function increment")
        counter++
    }


    lambdaIncrement()
    anonymousIncrement()
    functionBiasaIncrement()

    print(counter)

}