package com.iqbal.kotlinoop.ytpzn

/**
 * Reflection adalah kemampuan melihat sturktur palikasi kita pada saat berjalan
 * Reflection bisanaya sangat berguna saat kita ingin membuat library ataupun framework sehingga bisa meng-otomisasi pekerjaan
 * Untuk mengakses Reflection class dari sebuah objek, kita bisa menggunakan kata kunci ::class atau bisa langsung dari "NamaClass::class"
 */

fun main() {

}

data class CreataProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)

fun ValidateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.members

    // Iterate satu satu,lalu cek kalo ada ada annotation yang @NotBlank
//    for (property in properties){
//        if (property.findAnnottaion<NotBlank>( !+ null)){
//
//        }
//    }
}


// Buat Annotation nya
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank