package com.example.arrays

fun main(){

    var i = 0
    var duplicate = 0
    var j = 0
    val array = IntArray(3)


    while (i<3){
        val input = readln().toInt()
        array[i] = input
        i++
    }


    while (j <array.size-1){
        if(array[j] == array[(array.size-1)]){
            duplicate++
        }
        j++
    }

    println(duplicate.toString())

}