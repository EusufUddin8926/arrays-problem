fun insertInSortedPosition(element: Int, testArray: IntArray): IntArray {
    var p = 0
    val arraySize = testArray.size
    val finalArray = IntArray(arraySize + 1)

    for (i in testArray.indices) {
        if (testArray[i] > element) {
            p = i
            break
        } else {
            p = i + 1
            finalArray[i] = testArray[i]
        }
    }


    finalArray[p] = element


    for (i in p until arraySize) {
        finalArray[i + 1] = testArray[i]
    }

    return finalArray
}

fun main() {
    val testArray = intArrayOf(2,3, 4,7, 8)
    val insertItem = 5
    println(insertInSortedPosition(insertItem, testArray).contentToString())
}