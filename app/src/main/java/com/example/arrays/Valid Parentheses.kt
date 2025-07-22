package com.example.arrays

import java.util.LinkedList


fun main(){

    println(ValidParenThesis().isValid("(]"))
}

class ValidParenThesis {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for(c in s.toCharArray()){
            if(c== '('){
                stack.push(')')
            }else if(c == '['){
                stack.push(']')
            }else if(c == '{'){
                stack.push('}')
            }else if(stack.isEmpty() || stack.pop() != c ){
                return false
            }
        }
        return stack.isEmpty()
    }
}

class Stack<T>{
    private val items  = LinkedList<T>()
    fun push(item: T){
        items.addFirst(item)
    }

    fun pop(): T{
        if (items.isEmpty()) {
            throw NoSuchElementException("Stack is empty")
        }
      return  items.removeFirst()
    }

    fun peek(): T {
        if (items.isEmpty()) {
            throw NoSuchElementException("Stack is empty")
        }
        return items.last()
    }

    fun isEmpty() : Boolean{
        return items.isEmpty()
    }
}