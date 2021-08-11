package math

fun main() {

    val input1 = 10
    val input2 = 0
    val input3 = 1
    val input4 = 5 * 10 * 10 * 10 * 10 * 10 * 10

    println(countPrimes(input1))
    println(countPrimes(input2))
    println(countPrimes(input3))
    println(countPrimes(input4))

}


fun countPrimes(n: Int): Int {
    var count = 0
    for (i in 1..n) {
        if (i.isPrime()) {
            count++
        }
    }

    return count
}

fun Int.isPrime(): Boolean {
    if (this <= 1) {
        return false
    }

    var i = 2
    while (i * i <= this) {
        if (this % i == 0) {
            return false
        }
        i++
    }

    return true
}