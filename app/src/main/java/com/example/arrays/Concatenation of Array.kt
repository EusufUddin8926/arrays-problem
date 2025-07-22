package com.example.arrays

fun main(){

    val cArray = ConcatenationsArray().getConcatenation(intArrayOf(1,2,3))
    println(cArray.toMutableList())
}


class ConcatenationsArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val resArr = IntArray(nums.size*2)

        nums.forEachIndexed { index, num ->
            resArr[index]= num
            resArr[index+nums.size] = num
        }

        return resArr
    }
}