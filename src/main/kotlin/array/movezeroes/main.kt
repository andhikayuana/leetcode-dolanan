package array.movezeroes

fun main() {

    val input1 = intArrayOf(0, 1, 0, 3, 12)
    val expected1 = intArrayOf(1, 3, 12, 0, 0)

    val input2 = intArrayOf(0)
    val expected2 = intArrayOf(0)

    moveZeroes(input1)

    println(input1)
}

fun moveZeroes(nums: IntArray): Unit {
    var n = nums.size
    var i = 0
    var j = -1

    while (i < n) {
        if (nums[i] == 0 && j == -1) {
            j = i
        } else if (nums[i] != 0 && j != -1) {
            nums[j] = nums[i]
            nums[i] = 0
            j++
        }
        i++
    }
}