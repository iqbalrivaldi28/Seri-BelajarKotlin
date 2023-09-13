package com.iqbal.kotlinoop.ytpzn

/**
 * Saat kita membuat abstract class, kita juga bsa membuat properties dab function abstrect dikelas tersebut
 * properties dan function yang bersifat abstract harus dan wajib di buat ulang di class Child nya
 */

fun main() {

    val melon = Melon()
    println(melon.name)
    melon.flavor()

    val semangka = Semangka()
    println(semangka.name)
    semangka.flavor()

}


// Parent Class berupa ABstract
abstract class fruits() {
    abstract val name: String // Kalau abstract kita ngak perlu inisialisasi nilai variabelnya
    abstract fun flavor() // utnuk function sama juga ngaj perlu pake bodynya biar nanti di kelas Childnya aja
}

// Child Classnya (Harus mengoverride semua properties dan faunction abtratc dari Parentnya)
class Melon(): fruits() {
    override val name: String = "Melon"

    override fun flavor() {
        println("Ini adalah buah $name")
    }
}


class Semangka(): fruits(){
    override val name: String = "Semangka"

    override fun flavor() {
        println("Ini adalah bauuh $name")
    }

}