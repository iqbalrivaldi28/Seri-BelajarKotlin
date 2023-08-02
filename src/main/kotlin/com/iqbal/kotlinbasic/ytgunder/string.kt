package com.iqbal.kotlinbasic.ytgunder

fun main (){
    // Kita pangiil fungsinya disini sini
    indexingChar()
    println()

    escapeString()
    println()

    rawString()
}


fun indexingChar(){
    var fullName = "M. Iqbal Rivaldi"
    val firstChar = fullName[0]

    print("Karakter pertama dari nama $fullName adalah huruf $firstChar")
    println()
}


fun escapeString() {
    val campus = "Polinela ada di kota \"Bandar Lampung\" provinsi Lampung"  //escape string pake \

    print(campus)
    println()
}

fun rawString(){
    val myCampus = """
        Polinela berada di kota "Bandar Lampung",
        dan merupakan Politeknik terbaik yang ada di Lampung.
    """.trimIndent()

    print(myCampus)
}