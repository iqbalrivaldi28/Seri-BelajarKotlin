package com.iqbal.kotlinbasic.ytpzn

fun main() {

    // buat lambda
    val upperTranformer = { value: String -> value.toUpperCase()}
    println(hello("Iqbal", upperTranformer))

    // bisa juga penulisannya lambdanya gini (cara panjangnya)
    val lowerTransformer: (String) -> String = { value: String ->
        value.toLowerCase()
    }
    println(hello("NAISA", lowerTransformer))


    // bisa juga langsung masukin ke dalam parameternya
    println(hello("raisa", { value: String -> value.toUpperCase()} ))

    // bisa juga pake Trailling Lambda (dengan syarat lambda harus jadi parameter yang terakhir)
    var resultTrailingLambda = hello("KARTIKA") { value: String ->
        value.toLowerCase()
    }
    println(resultTrailingLambda)


}

// parameter keduanya adalah lambda
fun hello (value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}
