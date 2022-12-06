package algorithm.bubblesort

fun main() {
    val list = listOf(9, 6, 4, 5, 7, 3, 2, 8, 1, 0)
    val result = bubbleSort(list)
    println("RESULT: $result")
}

fun bubbleSort(list: List<Int>): List<Int> {
    val mutableList = list.toMutableList()
    for (i in 0 until mutableList.size - 1) {
        for (j in 0..mutableList.size - i) {
            if (j < mutableList.size - 1 && mutableList[j] > mutableList[j + 1]) {
                val tmp = mutableList[j]
                mutableList[j] = mutableList[j + 1]
                mutableList[j + 1] = tmp
            }
        }
    }

    return mutableList.toList()
}
