package com.iqbal.kotlinoop.ytpzn

/**
 * Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan utnuk
 * mengeksekusi objek dengna mudah dengan menggunakan lambda expression
 *
 * Funtion-fucntionya adalah let,run,with,apply dan also
 *
 * 1) Let Function
 * Bisa digunakan sebagai reference block agar lebih mudah ketika ingin memanipulasi sebuah object
 * let function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci "it" untuk mendapatkan referensi objet tersebut
 *
 * 2) Run Function
 * Run function mirip dengan let function
 * bedanya adalah run function tidak ada paremeter pada lambdanya, jadi ngak bisa akses pake kata kunci "it"
 * Tapi kita msaih bisa akses pake kata kunci "this"
 *
 * 3) Apply Function
 * Hampir sama kayak RUN
 * Yang membedakan adalah return value dari apply function adalah reference object itu sendiri
 *
 * 4) Also Function
 * Mirip kayak Let
 * Bedanya also function return valuenya adalah reference ke object itu sendiri
 *
 * 5) With Function
 * mirip dengan Run Function menggunakan reference "this"
 * Bedanya adalah With Function bulankan extension function, jadi ngak bisa dogunakan langsung dari objectnya
 * Kita harus memanggil with function secara manual
 */

fun main() {

    println("*******************************")
    println(" Function Scope LET")
    println("*******************************")

    // 1) Let Function
    val student = Student("Iqbal", 12)

    // Cara Akses lama
    println(student.name)
    println(student.age)

    // Cara akses pake Let Scope Function
    student.let {
        println(it.name)
        println(it.age)
    }

    // Bisa juga di tampung ke variabel dulu
    var result = student.let {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)

    println()

    println("*******************************")
    println(" Function Scope RUN")
    println("*******************************")

    // 2 Run Function
    student.run {
        println(this.name)
        println(this.age)
    }

    var result2 = student.run {
        "Name ${this.name}, age ${this.age}"
    }
    println(result2)

    println()

    println("*******************************")
    println(" Function Scope APPLY")
    println("*******************************")

    // Apply Function
    var result3: Student = student.apply {
        "Name ${this.name}, age ${this.age}"
    }
    println(result3)

    println()

    println("*******************************")
    println(" Function Scope ALSO")
    println("*******************************")

    var result4: Student = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result4)


    println()

    println("*******************************")
    println(" Function Scope ALSO")
    println("*******************************")


    var result5 = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result5)

}