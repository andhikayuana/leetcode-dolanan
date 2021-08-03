package array.removeduplicates

fun main() {
    val input1 = intArrayOf(1, 1, 2)
    val expected1 = 2

    val actual1 = removeDuplicates(input1)
    println(actual1)
    println("==")

}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var i = 0
    for (j in nums.indices) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }

    return i + 1

}
