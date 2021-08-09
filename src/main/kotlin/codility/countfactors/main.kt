package codility.countfactors

fun main() {
    val inputN1 = 24
    val expected1 = 8

    val output = solution(inputN1)
    println(output)

}

fun solution(N: Int): Int {
    var i = 1
    val result = mutableSetOf<Int>()
    while (i <= N) {
        if (N % i == 0) {
            result.add(i)
        }

        i++
    }

    return result.size
}