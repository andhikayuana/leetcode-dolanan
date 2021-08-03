package array.besttimetobuysell

fun main() {

    val input1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val expected1 = 7

    val input2 = intArrayOf(1, 2, 3, 4, 5)
    val expected2 = 4

    val input3 = intArrayOf(7, 6, 4, 3, 1)
    val expected3 = 0

    val actual = maxProfit(input1)
    println(actual)
    println("--")
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            maxProfit += prices[i] - prices[i - 1]
        }
    }

    return maxProfit
}
