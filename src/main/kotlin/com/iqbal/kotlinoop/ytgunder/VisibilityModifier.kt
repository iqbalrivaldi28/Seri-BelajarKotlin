package com.iqbal.kotlinoop.ytgunder

/**
 * Macam - macam visibility modifier adalah:
 * Public = Bisa diakses dari berbagai class
 * Private = Hanya bisa diakses di dalam kelas itu sendiri
 * Protected = Hanya bisa diakses dari kelas turunan kelas itu sendiri
 */

fun main() {

    // Public
    val cat = AnimalModifier("Cing-cing", 5)
    println("Kucing saya namanya adalah ${cat.name} dan umurnya ${cat.age}")

    cat.getName()

    println()

    // Private
    val bird = AnimalPrivate("BlueBird", 7)
    println("Nama burung = ${bird.getNamePrivate()}")
    println("Nama Baru burung = ${bird.setNamePrivate("Kutilang Emas")}")


    println()

    // Protected
    val cow = AnimalProtected("Sapii", 3)
    println("Umur hewanya ${cow.age}")  // cuman bisa akses agenya karena namenya di protected, jadi harus buat turnan classnya
}

// Public
class AnimalModifier(var name: String, var age: Int){

     fun getName(){
        println("Nama nya adalah $name")
    }
}


// Private
class AnimalPrivate(private var name: String, var age: Int){

    // Getter (Untuk dapatin valuenya)
    fun getNamePrivate(): String{
        return name
    }

    // Setter (Untuk merubah valueny)
    fun setNamePrivate(newName: String): String{
        this.name = newName
        return name
    }
}

// Protected
open class AnimalProtected(protected var name: String, var age: Int){

}

