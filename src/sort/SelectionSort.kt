package sort

fun selectionSort(intArr: IntArray): IntArray {

    val size = intArr.size - 1

    fun swap(index1: Int, index2: Int, arr: IntArray) {
        val temp = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = temp
    }

    for (i in 0 until size) {
        var minElement = intArr[i]
        var minElementIndex = i
        for (j in i..size) {
            if (intArr[j] < minElement) {
                minElement = j
                minElementIndex = j
            }
        }
        swap(i, minElementIndex, intArr)
    }
    return intArr
}