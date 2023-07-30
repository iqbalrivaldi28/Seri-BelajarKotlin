package com.iqbal.kotlinbasic.ytguna

fun main(){

    // return 1
    val funcReturn = functionReturn("Iqbal", 22, 'L')
    println(funcReturn)

    // return 2
    val funcReturnTwo = functionReturnTwo("Raisa", "Woman")
    println(funcReturnTwo)

    // Unit
    functionUnit("Boy")

}

// Return Mengembalikan Nilai
// Tipe penulisan 1
fun functionReturn(name: String, age: Int, gender: Char): String {
    return "Nama kamu adalah $name, usia kamu $age dan jenis kelamin kamu $gender"
}

// Tipe penulisan 2 (dia langaung bisa pake = aja tanpa { curly bracket  lagi )
fun functionReturnTwo(name: String, gender: String) = "Your name is $name and gender is $gender"


// Unit tidak mengembalikan Nilai
fun functionUnit(name: String){
    print("nama kamu adalah $name")
}