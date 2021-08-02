package codilitydemo

fun main() {
    val a = arrayOf(1, 3, 6, 4, 1, 2)
    //val a = arrayOf(1, 2, 3)
    val result = solution(a)

    //verify
    println(result)
}

fun solution(A: Array<Int>): Int {
    var smallestMissing = 1

    //array empty return 1
    if (A.isEmpty()) {
        return smallestMissing
    }

    //create sets of integer
    val tmp = mutableSetOf<Int>()

    //loop and add to sets if greter than 0
    A.forEach {
        if (it > 0) {
            tmp.add(it)
        }
    }


    //increase while inside sets contains smallestMissing
    while (tmp.contains(smallestMissing)) {
        smallestMissing++
    }

    return smallestMissing
}
