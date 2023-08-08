package com.iqbal.kotlinbasic.ytpzn

fun main() {
    var result = "Iqbal Rivaldi" menjadi "UP"
    println(result)
}

// infix notation

infix fun String.menjadi(type: String):String {
//    if (type == "UP") {
//        return this.toUpperCase()
//    } else{
//        return this.toLowerCase()
//    }

    // penyedehaan penulian IF
    return if (type == "UP") this.toUpperCase() else this.toLowerCase()
}