package com.example.arrays


fun main(){

    val removeElement = RemoveElement().removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2)
    println(removeElement.toString())
}

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0

        for (j in nums.indices) {
            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
            }
        }

        println(nums.toMutableList())

        return i
    }
}