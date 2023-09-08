package com.iqbal.kotlinbasic.ytpzn

fun main() {
    loopi@ for(i in 1..3){
        loopj@ for (j in 1..3){
            if (j == 2){
                continue@loopi
            }
            println("$i * $j = ${i * j}")
        }
    }

}