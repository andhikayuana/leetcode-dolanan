package array.intersectiontwoarray

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)
    val expected = intArrayOf(2, 2)

    val nums1b = intArrayOf(4, 9, 5)
    val nums2b = intArrayOf(9, 4, 9, 8, 4)
    val expectedb = intArrayOf(4, 9)
    //[9,4] is also accepted.

    val output = intersect(nums1, nums2)

    println(output.toString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val tmp = hashMapOf<Int, Int>()
    val result = mutableListOf<Int>()

    for (num in nums1) {
        tmp[num] = tmp.getOrDefault(num, 0) + 1
    }
    for (num in nums2) {
        if (tmp.containsKey(num)) {
            result.add(num)
            tmp[num] = tmp[num]!!.minus(1)
            tmp.remove(num, 0)
        }
    }

    return result.toIntArray()
}