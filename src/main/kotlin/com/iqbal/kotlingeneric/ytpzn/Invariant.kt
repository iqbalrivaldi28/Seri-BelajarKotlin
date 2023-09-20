package com.iqbal.kotlingeneric.ytpzn

/**
 * Secara default kalau buat generic paramet itu sifatnya adalah Invariant
 *
 * Invariant adalah tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
 *
 * Contohnya adalah object seperi ini tidak sama dengan/tidak boleh
 * Contoh<String> = Contoh<Any>
 * Contoh<Any> = Contoh<String>
 *
 * Itu ngak boleh disubtitusi
 */

fun main() {
    val invariantString = Invariant<String>("String")

    // Bahaya akalau di subtitusi ke Any
//    val invariantAny: Invariant<Any> = invariantString  (Error kalau di subtitusi kayak ini)
//    invariantAny.data = 100
}

class Invariant<T> (val data: T) {
}