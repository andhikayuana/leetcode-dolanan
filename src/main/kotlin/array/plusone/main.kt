package array.plusone

fun main() {
    val input1 = intArrayOf(1, 2, 3)
    val expected1 = intArrayOf(1, 2, 4)

    val input2 = intArrayOf(4, 3, 2, 1)
    val expected2 = intArrayOf(4, 3, 2, 2)

    val input3 = intArrayOf(0)
    val expected3 = intArrayOf(1)

    val input4 = intArrayOf(9)
    val expected4 = intArrayOf(1, 0)

    val input5 = intArrayOf(3, 9, 9, 9)
    val expected5 = intArrayOf(4, 0, 0, 0)

    val output = plusOne(input5)
    println(output)
}

//approach 1
fun plusOne(digits: IntArray): IntArray {

    var tmp = 1 //store digit when appear
    var index = digits.lastIndex

    while (index >= 0 && tmp > 0) {
        digits[index] = (digits[index] + 1) % 10
        tmp = if (digits[index] == 0) 1 else 0
        index--
    }

    if (tmp > 0) {
        val x = IntArray(digits.size + 1)
        x[0] = 1
        return x
    }

    return digits
}