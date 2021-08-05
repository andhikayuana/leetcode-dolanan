package array.containsduplicate

fun main() {

    val input = intArrayOf(1, 2, 3, 1)
    val expected = true

    val input2 = intArrayOf(1, 2, 3, 4)
    val expected2 = false

    val input3 = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    val expected3 = true

    val output = containsDuplicate(input3)

    println(output)
}

fun containsDuplicate(nums: IntArray): Boolean {
    val tmp = hashSetOf<Int>()

    for (num in nums) {
        if (tmp.contains(num)) {
            return true
        }
        tmp.add(num)
    }

    return false
}