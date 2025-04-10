package com.example.arrays

fun main() {

    var testCases = readln().toInt()


    while (testCases > 0) {
        val arraySize = readln().toInt()
        val array = readln().split(" ").map { it.toInt() }

        if (arraySize == array.size) {
            var max = array[0]
            var i = 1

            while (i <= array.size - 1) {
                if (array[i] > max) {
                    max = array[i]
                }
                i++
            }

            println(max.toString())
        } else {
            println("Invalid input")
        }

        testCases --
    }


}