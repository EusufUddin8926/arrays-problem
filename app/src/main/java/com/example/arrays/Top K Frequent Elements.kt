package com.example.arrays

fun main(){

   val result = TopKElement().topKFrequent(intArrayOf(1,2), 2)
    println(result.toMutableList())
}

class TopKElement {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val resultMap = mutableMapOf<Int, Int>()

        for(num in nums){
            resultMap[num] = resultMap.getOrDefault(num, 0) + 1
        }

        println(resultMap)
        val bucket = Array(nums.size+1){ mutableListOf<Int>() }

        resultMap.forEach{ (num, freq) ->
            bucket[freq].add(num)
        }

        val result = mutableListOf<Int>()
        for (i in bucket.size - 1 downTo 1) {
            for (num in bucket[i]) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}