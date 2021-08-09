package codility.nondivisors

fun main() {

//    A[0] = 3
//    A[1] = 1
//    A[2] = 2
//    A[3] = 3
//    A[4] = 6

    val input1 = intArrayOf(3, 1, 2, 3, 6)
    val expected1 = intArrayOf(2, 4, 3, 2, 0)

    val output = solution(input1)

    println(output.toString())
}

fun solution(A: IntArray): IntArray {
    val result = mutableListOf<Int>()
    for (itemAi in A) {
        var count = 0
        for (itemAj in A) {
            if (itemAi % itemAj != 0) {
                count +=1
            }
        }
        result.add(count)
    }
    return result.toIntArray()
}