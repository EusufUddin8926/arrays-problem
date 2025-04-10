package com.example.arrays

fun main(){
    var i = 0
    val array = IntArray(10)
    while (i < 10){
        val input = readln().toInt()
        array[i] = input
        i++
    }

    println(array.joinToString())
}