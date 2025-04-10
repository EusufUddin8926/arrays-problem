package com.example.arrays

fun main() {

    val (arrSize, element) = readln().split( " ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }
    var isElementFound = false

    if(arrSize == array.size){
        for(arrEle in array){
            if(arrEle == element){
                isElementFound = true
                break
            }
        }
        println(if (isElementFound) "YES" else "NO")
    }else{
        println("Invalid Input")
    }



}