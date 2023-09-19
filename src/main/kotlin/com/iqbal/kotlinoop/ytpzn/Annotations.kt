package com.iqbal.kotlinoop.ytpzn

/**
 * Annotation adalah menambahkan metadata ke kode program yang kita buat
 * Tidak semua orang membutuhkan anotation, bisanaya hanya digunakan saat ingub membuat library / framework
 * Untuk membuat class annotation gunakan kata kunci "annotation" sebelum nama class
 * Annotation hanya boleh memiliki properties via primary constructor tidak boleh ada member lain (seperti functuin atau properties di bodynya)
 */

fun main() {
    val myApplication = MyApplications("Kotlin", 1)
    println(myApplication.info())
}


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)


@Fancy(author = "Iqbal")
class MyApplications(val name: String, val version: Int){

    fun info(): String = "Application $name ~$version"

}