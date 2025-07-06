package com.example.arrays

fun main() {
    var i = 0
    var j = 0
    val firstArray = IntArray(3)
    val secondArray = IntArray(3)
    val resArray = IntArray(firstArray.size + secondArray.size)

    while (i < 3) {
        val input = readln().toInt()
        firstArray[i] = input
        i++
    }

    while (j < 3) {
        val input = readln().toInt()
        secondArray[j] = input
        j++
    }

    while ( i < firstArray.size){
        if(firstArray[i] < secondArray[i]){
            resArray[i] = firstArray[i]
        }else{
            resArray[i] = secondArray[i]
        }
    }


}