package array.singlenumber

fun main() {
    val input1 = intArrayOf(2, 2, 1)
    val expected1 = 1

    val input2 = intArrayOf(4, 1, 2, 1, 2)
    val expected2 = 4

    val input3 = intArrayOf(1)
    val expected3 = 1

    val output = singleNumber(input3)

    println(output)
}

//approach 1
fun singleNumber(nums: IntArray): Int {
    val tmp = hashMapOf<Int, Int>()
    for (num in nums) {
        tmp[num] = tmp.getOrDefault(num, 0) + 1
    }
    for (num in nums) {
        if (tmp[num] == 1) {
            return num
        }
    }

    return 0
}