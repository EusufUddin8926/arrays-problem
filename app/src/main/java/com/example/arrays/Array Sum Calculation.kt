package com.example.arrays

fun main(){
    var i = 0
    var j = 0
    var total = 0
    val array = IntArray(3)
    while (i<3){
        val input = readln().toInt()
        array[i] = input
        i++
    }

    while (j<array.size){
        total += array[j]
        j++
    }

    println(total)
}