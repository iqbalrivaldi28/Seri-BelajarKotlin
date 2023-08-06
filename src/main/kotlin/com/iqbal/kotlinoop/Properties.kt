package com.iqbal.kotlinoop

fun main() {
    // Setter ( Untuk memberikan nilai ) (disini kita memberikan nilai untuk propertynya)
    val myCat = myAnimal("Si Jalu", 2)

    // Getter (Untuk mengambil nilai)
    myCat.Eat()
}


class myAnimal(val name: String, val age: Int){
    fun Eat(){
        println("Hewan peliharaan saya bernama $name dan berusia $age tahun")
    }
}