package com.iqbal.kotlinbasic.ytguna

fun main() {
    elvisOperator()
}

fun elvisOperator() {
    val text: String? = null
    print(text?.length?:7)

}
