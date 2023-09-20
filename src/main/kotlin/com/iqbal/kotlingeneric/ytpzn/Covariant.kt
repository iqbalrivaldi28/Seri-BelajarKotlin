package com.iqbal.kotlingeneric.ytpzn

/**
 *
 */

fun main() {

    // Kalau Covariant bisa Subtitusi
    val covariantString = Covariant<String>("Iqbal")
    val covariantAny: Covariant<Any> = covariantString    // Subtitusi

    println(covariantAny.sayHellow())
}


// Covariant pake keyword "out"
class Covariant<out T> (val data: T) {

    // Tidak boleh ngebuat function dengan input generic covariant
    fun sayHellow(): T {
        return data
    }
}