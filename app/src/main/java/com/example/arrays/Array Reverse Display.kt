package com.example.arrays

fun main(){
    var i = 0
    var j = 0
    val array = IntArray(3)
    val resArr = IntArray(3)
    while (i<3){
        val input = readln().toInt()
        array[i] = input
        i++
    }

    while (j<array.size){
        resArr[j] = array[array.size-j-1]
        j++
    }

    println(resArr.joinToString())
}