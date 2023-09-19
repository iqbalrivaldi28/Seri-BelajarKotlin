package com.iqbal.kotlinoop.ytpzn

/**
 * Kotlin Annotation berlajalan baik dengan Java Annotation
 * Namun kadang kita ingin menempatkan posisi Annotation sesuai denga yang kita mau agar mudah terbaca di Java dengan baik
 * Biasanay kejadian ini terjadi ketika kita menggunakan Kotlin, namun menggunakan framework Java, sehing target Annotation nya harus sesuai dengan yang biasa digunakan framework Java
 * Di Kotlin kita bisa menggunakan " @target:NamaAnnotation " nya untuk menentukan lokasi target Annotation yang akan ditempatkan dimana
 */

fun main() {

}


@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()


class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)