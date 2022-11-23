package array.besttimetobuysell

fun main() {

    val input1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val expected1 = 5

    val actual = maxProfit(input1)
    println(actual)
    println("--")
}

fun maxProfit(prices: IntArray): Int {
    var buy = prices[0]
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (buy > prices[i]) {
            buy = prices[i]
        } else if ((prices[i] - buy) > maxProfit) {
            maxProfit = prices[i] - buy
        }
    }

    return maxProfit
}