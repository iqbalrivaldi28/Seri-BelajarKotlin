package com.iqbal.kotlinbasic.ytgunder

fun main() {
    elvisOperator()
}

fun elvisOperator() {
    val text: String? = null
    print(text?.length?:7)

}
