package com.example.arrays

fun main(){
    var i = 0
    val array = IntArray(4)
    val uniqe = IntArray(array.size)


    while (i<4){
        val input = readln().toInt()
        array[i] = input
        i++
    }

    for(i in array.indices){
        for (j in i+1..<array.size-1){
           if(array[i] == array[j]){
               break
           }
            if(j == array.size-1){
                uniqe[i] = array[i]
            }
        }
    }

    println(uniqe.joinToString())
}