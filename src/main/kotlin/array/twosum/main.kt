package array.twosum

fun main() {

    val inputNums1 = intArrayOf(2, 7, 11, 15)
    val inputTarget1 = 9
    val expected1 = intArrayOf(0, 1)

    val inputNums2 = intArrayOf(3, 2, 4)
    val inputTarget2 = 6
    val expected2 = intArrayOf(1, 2)

    val inputNums3 = intArrayOf(3, 3)
    val inputTarget3 = 6
    val expected3 = intArrayOf(0, 1)

    val output = twoSum(inputNums1, inputTarget1)
    println(output)

    val output2 = twoSum(inputNums2, inputTarget2)
    println(output2)

    val output3 = twoSum(inputNums3, inputTarget3)
    println(output3)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val tmp = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (tmp.containsKey(complement)) {
            return intArrayOf(tmp[complement]!!, i)
        }

        tmp[nums[i]] = i
    }
    return intArrayOf()
}