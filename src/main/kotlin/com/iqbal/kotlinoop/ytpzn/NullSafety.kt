package com.iqbal.kotlinoop.ytpzn

/**
 * Tipda dan trik agar terhindar dari Null Pointer Exception
 */

fun main() {

    // Cara 1
    sayHelloFriend(Friend("Naisa"))

    // Cara 2
    sayHelloFriend2(Friend("Hanan"))
    sayHelloFriend2(null) // Kelemahan cara 2 dia akna mencetak "Hello Null"

    // Cara 3
    // Cara 2
    sayHelloFriend3(Friend("Cinta"))
    sayHelloFriend3(null) // Pake elvis operator, jadi kalau ada nilai null dia langsung ngasih nilai defaultnya
}


data class Friend(val name: String)

// Cara 1 pake pengecekan menggunakan if()
fun sayHelloFriend(friend: Friend?) {
    if (friend != null){
        println("Hello friend ${friend.name}")
    }
}

// Cara 2 menggunakan Safe Call "?"
fun sayHelloFriend2(friend: Friend?){
    println("Hello ${friend?.name}")
}

// Cara 3 pake Elvis Operator
fun sayHelloFriend3(friend: Friend?){
    val name = friend?.name ?: "Default Nilai"
    println("Hello $name")
}