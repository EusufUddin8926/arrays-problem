package com.example.arrays

import java.util.LinkedList

fun main(){
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    minStack.getMin()
    minStack.pop()
    minStack.top()
    minStack.getMin()
}


class MinStack{
    private val items = LinkedList<Int>()

    fun push(item: Int){
        items.addFirst(item)
    }
    fun pop(){
        items.removeFirst()
    }
    fun top(): Int{
        return items.first
    }

    fun getMin(): Int {
        var min: Int = items[0]
        for (item in items) {
            if (min > item) {
                min = item
            }
        }
        return min
    }
}
