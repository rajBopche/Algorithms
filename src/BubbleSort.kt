class BubbleSort {

    fun sort(intArray: IntArray) {

        val size = intArray.size - 1

        for (j in 0..size) {
            for (i in 0 until size) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(i, i + 1, intArray)
                }
            }
        }

        intArray.map { print(it) }
    }

    private fun swap(index1: Int, index2: Int, arr: IntArray) {
        val temp = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = temp
    }

}