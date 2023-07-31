package com.iqbal.kotlinbasic.ytguna

fun main() {
    nullAble()
}

// Nullable
fun nullAble() {
    var text: String? = null

    text?.length  // bisa pake safe call pake tanda ?

    if (text != null) {  // bisa pake pengecekan pake if
        text.length
    }
}