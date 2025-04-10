package com.example.arrays


fun main() {
    var testCase = readln().toInt()

    while (testCase > 0) {
        val (n, x, y) = readln().split(" ").map { it.toInt() }
        val itemsPrice = readln().split(" ").map { it.toInt() }
        if(n != itemsPrice.size){
            println("Invalid price input")
            continue
        }
        val totalPrice = itemsPrice.sum()
        var totalDiscountPrice = 0
        var i = 0

        while (i <= itemsPrice.size - 1) {

            if(itemsPrice[i] > y){
                totalDiscountPrice += (itemsPrice[i]-y)
            }else{
                totalDiscountPrice += 0
            }
            i++
        }

        val totalDiscount = x+totalDiscountPrice
        if(totalDiscount < totalPrice){
            println("COUPON")
        }else{
            println("NO COUPON")
        }

        testCase --
    }
}