package algorithm.binarysearch

fun main() {
    //binary search need sorted
    val list = listOf(0,1,2,3,4,5,6,7,8,9)
    val search = 8
    val result = binarySearch(list, search)
    println("RESULT: $result")
}

fun binarySearch(list: List<Int>, search: Int): Boolean {
    var left = 0
    var right = list.size - 1
    for (i in list.indices) {
        val mid = (left + right) / 2
        if (search < list[mid]) {
            right = mid - 1
        } else if (search > list[mid]) {
            left = mid + 1
        } else {
            return true
        }
    }
    return false
}
