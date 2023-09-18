package com.iqbal.kotlinbasic.ytpzn

fun main() {

    println(contohLambda("Iqbal"))
    println(contohLambdaDua("Iqbal", "Rivaldi"))
    println(contohLamndaTiga("Messi", 34, true))
    println(LoginCallback(true))

    // lambda references
    println(resultReferencesLmabda)
}


// Membuat Lambda pake it kalau cuman satu parameter
val contohLambda: (String) -> String = {
    it.toUpperCase()
}

val LoginCallback: (Boolean) -> Boolean  = { login: Boolean ->
    login
}

val contohLambdaDua: (String, String) -> String = { firstName: String, lastName: String ->
    var result = "$firstName $lastName"
    result
}

val contohLamndaTiga: (String, Int, Boolean) -> String = {name: String, age: Int, human: Boolean ->
    var dataIsHuman = "$name $age $human"
    dataIsHuman
}



// Method References (panggiil fungsi lain di parameternya lambda

// 1. Buat fungsi lain
fun toUpper(value: String): String {
    return value.toUpperCase()
}

// 2. Buatlambdanya
val lambdaReferences: (String) -> String = ::toUpper

// 3. eksekusi lambda
val resultReferencesLmabda = lambdaReferences("kotlin")






