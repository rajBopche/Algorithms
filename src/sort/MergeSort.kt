package sort

fun mergeSort(ipArr: IntArray, startIndex: Int, endIndex: Int) {

    if (startIndex < endIndex) {
        val mid = (startIndex + endIndex) / 2
        mergeSort(ipArr, startIndex, mid)
        mergeSort(ipArr, mid + 1, endIndex)
        merge(ipArr, startIndex, mid, endIndex)
    }
}

fun merge(ipArr: IntArray, startIndex: Int, mid: Int, endIndex: Int) {
    val opArr = IntArray(endIndex - startIndex + 1)
    var i = startIndex
    var j = mid + 1
    var k = 0

    while (i <= mid && j <= endIndex) {
        if (ipArr[i] <= ipArr[j]) {
            opArr[k] = ipArr[i]
            ++i
        } else {
            opArr[k] = ipArr[j]
            ++j
        }
        ++k
    }

    while (i <= mid) {
        opArr[k] = ipArr[i]
        ++i
        ++k
    }

    while (j <= endIndex) {
        opArr[k] = ipArr[j]
        ++j
        ++k
    }

    for ((n, m) in (startIndex..endIndex).withIndex()) {
        ipArr[m] = opArr[n]
    }

}

fun main() {
    val intArray = intArrayOf(2, 9, 3, 7, 1)
    mergeSort(intArray, 0, 4)
    intArray.map { print(" $it") }
}