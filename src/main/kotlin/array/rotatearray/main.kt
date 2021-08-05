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

//approach 1
fun rotateArray(nums: IntArray, k: Int): Unit {
    val l = k % nums.size
    var i = 0
    var tmp = 0
    var prev = 0

    while (i < l) {
        prev = nums[nums.size - 1]
        for (j in nums.indices) {
            tmp = nums[j]
            nums[j] = prev
            prev = tmp
        }
        i++
    }

    println(nums.joinToString(","))
}

//approach 2