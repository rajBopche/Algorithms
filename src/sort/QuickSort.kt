package sort

fun quickSort(ipArr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val q = partition(ipArr, low, high);
        quickSort(ipArr, low, q - 1);
        quickSort(ipArr, q + 1, high);
    }
}

fun partition(ipArr: IntArray, low: Int, high: Int): Int {
    val pivot = ipArr[high]
    var i = low - 1
    for (j in low until high) {
        if (ipArr[j] <= pivot) {
            ++i
            swap(i, j, ipArr)
        }
    }
    swap(i + 1, high, ipArr)
    return i + 1
}

fun swap(index1: Int, index2: Int, arr: IntArray) {
    val temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp
}

fun main() {
    val ipArr = intArrayOf(1, 4, 3, 2,6)
    quickSort(ipArr, 0, 3)
    ipArr.map { print(" $it") }
}