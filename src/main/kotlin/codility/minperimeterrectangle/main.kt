package codility.minperimeterrectangle

fun main() {
    val input1 = 30
    val expected1 = 22

    val output1 = solution(input1)
    println(output1)
}

fun solution(N: Int): Int {
    var i = 1
    val perimeters = mutableSetOf<Int>()
    while (i <= N) {
        if (N % i == 0) {
            val A = i
            val B = N / i

            val perimeter = 2 * (A + B)
            if (!perimeters.contains(perimeter)) {
                perimeters.add(perimeter)
            }
        }
        i++
    }

    return perimeters.minOf { it }
}