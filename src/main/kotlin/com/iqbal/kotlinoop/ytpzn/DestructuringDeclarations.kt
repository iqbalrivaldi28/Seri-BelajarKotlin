package com.iqbal.kotlinoop.ytpzn

/**
 * Destructuring Declarations adalah membuat multiple variable dari sebuah objek
 * Destructuring tidak bisa dilakukan di semua objek, hanya objek yang mmeiliki function componentX() yan bisa melkukan destructing
 * Saat kta membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengna jumlah parameter nya
 *
 * ComponentX() adalag functun bawaan Data Class, itu kayak componenet1(), componenet2() dst
 *
 * Destructuring Declarations bisa juga dilakukan ketika memanggil function
 * Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
 */

fun main() {
    val game = Game("Game Kotlin", 7_000_000)

    // cara akses objeknya secara biasa
//    val name = game.name
//    val price = game.price

    // Cara akses pake Destructuring Declarations (Multiple variabel daru sebuah objek)
    val (name, price) = game
    println(name)
    println(price)

/////////////////////////////////

    // Contoh Desturction Function
    val (min, max) = minmax(1000, 100)
    println(min)
    println(max)
    // JIKA salah satu properties data class tidak mau dipake bisa pake underscore "_"   minmax(1000, _)

///////////////////////////////////

    // Contoh Desturction Lambda
    val login = Login("Iqbal", "Rahasia")

    // Panggil cara lama
//    login(login){ login ->
//        login.user == " Iqbal" && login.password == "Ragasia"
//    }

    //panggil pake cara Desturction
    login(login) { (user, password) ->
        user == "Iqbal" && password == "Rahasia"
    }
}


// Contoh Descturcturing Properties
data class Game(val name: String, val price: Int){
    // Kalau bukan data class harus buat function kayak ini
//    operator fun component1(): String = name
//    operator fun component2(): String = price

    // Kalau udah berupa data class otomatis functonya dibuatkan
}



// Contoh Descturcturing Function
data class MinMAX(val mint: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMAX {
    return when {
        value1 > value2 -> MinMAX(value2, value1)
        else -> MinMAX(value1, value2)
    }
}


// Contoh Descturcturing Lambda Parameter
data class Login(val user: String, val password: String)


fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}