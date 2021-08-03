package array.rotatearray

fun main() {
    //first  -> nums
    //second -> k
    val input1 = Pair(
        first = intArrayOf(1, 2, 3, 4, 5, 6, 7),
        second = 3
    )
    val expected1 = intArrayOf(5, 6, 7, 1, 2, 3, 4)

    val input2 = Pair(
        first = intArrayOf(-1, -100, 3, 99),
        second = 2
    )
    val expected2 = intArrayOf(3, 99, -1, -100)

    val actual = rotateArray(input1.first, input1.second)

}

fun rotateArray(nums: IntArray, k: Int): Unit {
    var i = 0
    var j = nums.size - 1
    while (i < k) {

//todo


        i++
        i--
    }
}
