package com.iqbal.kotlinoop.ytpzn

import kotlin.properties.Delegates

/**
 * Salah satu stdndar library yang disediakan oleh kotlin untuk delegations adalah observable properties
 * Dengan observable properties, kita bisa tahu properties, value sebelum dan value seteleh ketika diubah
 *
 * Kita bisa mendetect perubah nilai yang terjadi pada properties dengan syaray berupa "Var"
 */

fun main() {
    var observaleProperties = ObservablePropperties()
    observaleProperties.descsription = "Contoh"
    observaleProperties.descsription = "Diubah"
    observaleProperties.descsription = "Hello Kotlin!"

    println()

    // ContOh 2
    var penghitungAngka = PenghitungAngka(3)
    penghitungAngka.angka = 1
    penghitungAngka.angka = 2
}

// Contoh 1
class ObservablePropperties(description: String = "") {

    var descsription: String by  Delegates.observable(description) { property, oldValue, newValue ->   // Pake lambda yang property ini. ada 3 lambda
        println("${property.name} is change from $oldValue to $newValue")
    }

}

class PenghitungAngka(angka: Int = 0){
    var angka: Int by  Delegates.observable(angka) { property, oldValue, newValue ->
        println("${property.name} dimulai dari $oldValue, diubah ke $newValue")
    }
}