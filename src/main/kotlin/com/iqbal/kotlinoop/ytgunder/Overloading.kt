package com.iqbal.kotlinoop.ytgunder

/**
 * Overloading adalah penulisan kembali function yang ada di parent class tetapi harus ada perbedaan parameternya
 */

fun main() {

    // Kita buat objek dari kelas Toyota
    val fortuner = Toyota("Fortuner", "Toyota", 4)
    println("Nama mobil adalah ${fortuner.name} merek ${fortuner.merek} dan jumlah ban ${fortuner.jmlRoda}")

    fortuner.mesin()
    fortuner.mesin("Diesel")
    fortuner.roda()
}


open class Mobil(val name: String, val merek: String, val jmlRoda: Int){
    open fun mesin(){
        println("Mesin mobil $name dihidupkan")
    }

    open fun mesin(jnsMesin: String){
        println("Jenis mesin adalah $jnsMesin")
    }

    open fun roda(){
        println("Jumlah roda mobil = $jmlRoda")
    }

}

class Toyota(name: String, merek: String, jmlRoda: Int): Mobil(name, merek, jmlRoda){

    override fun mesin(){
        println("Mesin mobil $name di hidupkan")
    }

    override fun mesin(jnsMesin: String) {
        super.mesin(jnsMesin)
    }

    override fun roda() {
       println("Ini rodanya ada $jmlRoda dan 1 roda serep")
    }
}
