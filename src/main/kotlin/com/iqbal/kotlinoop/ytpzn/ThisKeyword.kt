package com.iqbal.kotlinoop.ytpzn

/**
 * This adalah keyword yang dibus digunakan untuk memnagil properties yang ada di primary constructor
 * biasnaya this digunakan untuk mengkases properties yang tertutup dengan parameter jika namanya sama
 */

fun main() {

    val objek1 = ThisKeyword("Budi")
    objek1.lastName = "Nugroho"
    objek1.sayHello("Joko")
}


// Karena nama properties dan constructornya sama yaotu "Name" jadi buat this.name untuk menagil yang ada di constructornya
class ThisKeyword(val name: String) {

    var lastName: String = ""

    fun sayHello (name: String){
        println("Hello $name, my name ${this.name} ${this.lastName}")
    }

}