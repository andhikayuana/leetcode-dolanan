package codility.chocolatesbynumber

fun main() {

    val input1 = Pair(10, 4)
    val expected1 = 5

    val output1 = solution(input1.first, input1.second)
    println(output1)

//    val output2 = solution(24, 18)
//    println(output2)

}


fun solution(N: Int, M: Int): Int {
    var i = 1
    var start = 0
    val result = mutableSetOf(0)

    while (i < N) {
        start = (start + M) % N
        result.add(start)

        i++
    }

    println(result.toString())

    return result.size
}