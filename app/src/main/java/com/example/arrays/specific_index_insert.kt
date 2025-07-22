package com.example.arrays

fun main() {

   val output =  insert(intArrayOf(10, 20,30,40,50), 2)
    println(output.toMutableList())
}

// First Solution

//fun insert(arr: IntArray, pos: Int) : IntArray{
//    val output = IntArray(arr.size+1)
//
//    for(i in output.indices){
//        if(pos>i){
//            output[i] = arr[i]
//            continue
//        }
//
//        if(pos == i){
//            output[i] = 100
//        }else{
//            output[i] = arr[i-1]
//        }
//    }
//
//    return output
//}

// Second Solution
//fun insert(arr: IntArray, pos: Int): IntArray {
//    val output = IntArray(arr.size + 1)
//    var p = 0
//
//    for(i in arr.indices){
//
//        if(i == pos){
//            p = i
//            output[i] = 100
//            break
//        }
//        output[i] = arr[i]
//    }
//
//    output[pos] = 100
//
//    for (i in p until arr.size) {
//        output[i + 1] = arr[i]
//    }
//
//    return output
//}

//Third Solution
fun insert(arr: IntArray, pos: Int): IntArray {
    val output = IntArray(arr.size + 1)

    for (i in 0 until pos) {
        output[i] = arr[i]
    }

    output[pos] = 100

    for (i in pos until arr.size) {
        output[i + 1] = arr[i]
    }

    return output
}

