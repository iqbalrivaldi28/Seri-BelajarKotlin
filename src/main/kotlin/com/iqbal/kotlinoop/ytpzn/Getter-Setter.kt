package com.iqbal.kotlinoop.ytpzn

/**
 * Getter adalah function yang dibuat untuk mengambil data Properties
 * Setter adalah function untuk merubah data propertiesnya
 *
 * Getter dan Setter tidak wajib dideklarasikan semua di Kotlin
 * Kita bisa hanya mendeklarasikan hanya Getetr atau Setter Saja
 *
 * Dengan artian jika "Var" berarti datana bia siubah pake Setter
 * kalau "Val" kita cuman bisa Getter data saja
 */

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title) // otomatis manggil getter

    note.title = "Belajar Kotlin Android"  // kalau kita ubah nilainya dia otomatis manggil setter
    println(note.title)


    // Tanpe penggunaan Setter
    val bigNote = BigNote("Belajar Kotlin Bersama PZN")
    println(bigNote.title)
    println(bigNote.bigTitle)
}

class Note(title: String) {

    var title: String = title

    // Getter
        get() = field // fiels disini mengarah ke properties title
        //get() = title // Bisa juga tembak langsung nama propertiesnya

    // Setter
    set(value) {
        // field = value //  tanpa validasi
        println("Call Setter Funvtion")

        if (value.isNotBlank()){
            field = value
        }
    }
}


class BigNote(val title: String){
    val bigTitle: String
        get() = title.toUpperCase()
}