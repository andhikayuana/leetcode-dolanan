package algorithm.linearsearch

fun main() {
    //given list of integers
    val list = listOf(1,4,5,6,8,9,0,7,3,2)
    val search = 0
    val result = linearSearch(list, search)
    println("RESULT: $result")
}

fun linearSearch(list: List<Int>, search: Int): Boolean {
    for (i in list.indices) {
        if (list[i] == search) return true
    }
    return false
}
