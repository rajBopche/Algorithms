fun insertionSort(numberList: Array<Int>): Array<Int> {
    val listSize = numberList.size

    for (item in 1 until listSize) {
        val key = numberList[item] //take the key element
        var previousIndex = item - 1 //take the element just previous to key element

        //Check if previousElement is larger than current element, if yes duplicate it to current position and
        //then check for more previous element
        while (previousIndex > -1 && numberList[previousIndex] > key) {
            numberList[previousIndex + 1] = numberList[previousIndex]
            --previousIndex
        }

        numberList[previousIndex + 1] = key //place the key at current position
    }
    return numberList
}

fun main() {
    insertionSort(arrayOf(5, 4, 6, 3, 1, 2, 5, 7, 8, 9, 12, 56, 77)).map { item -> print(" $item") }
}
