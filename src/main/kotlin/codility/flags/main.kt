package codility.flags

fun main() {

    val input = intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
    val expected = 3

    val output = solution(input)
    println(output)

}


fun solution(A: IntArray): Int {
    var i = 1
    val len = A.size - 2
    val tmp = mutableListOf<Int>()
    while (i <= len && A.size <= 400000) {

        val left = A[i - 1]
        val middle = A[i]
        val right = A[i + 1]

        if (middle > left && middle > right) {
            tmp.add(i)
        }

        i++
    }

    return tmp.filterIndexed { index, i -> i >= A[index] }.size

//    println(tmp.toString())

//    return tmp.size
}
