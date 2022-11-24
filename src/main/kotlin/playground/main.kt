package playground

fun main() {
    println("Sum of 3")

    testCaseOne(arrayOf(0), false)
    testCaseOne(arrayOf(-2, 0, 2), true)
    testCaseOne(arrayOf(-1, 0, 1), true)
    testCaseOne(arrayOf(-5, 0, 3, 2), true)
    testCaseOne(arrayOf(-2, 0, 1), false)

}

// input array of int, they are unique, not sorted
// check contains such unique a + b + c = 0, pick 3 element randomly , return true, other return false

// -2, 0, 2 = 0 (-2,0,2)
// -1, 0, 1, 2 = 0 (-1,0,1)
// -5, 0, 3, 2, 1, 10, -2 = 0 (-5,3,2) || (2,0,-2)
//


fun checkThree(nums: Array<Int>): Boolean {

    //need pointer

    for (firstPointer in 0..nums.size - 1) {
        for (secondPointer in firstPointer + 1..nums.size - 1) {
            for (thirdPointer in secondPointer + 1..nums.size - 1) {
                var tmpSum = nums[firstPointer] + nums[secondPointer] + nums[thirdPointer]

                println("${nums[firstPointer]} ${nums[secondPointer]} ${nums[thirdPointer]} = $tmpSum")

                if (tmpSum == 0) {
                    return true
                    break
                }
            }
        }
    }
    return false
}

// positive scenario
fun testCaseOne(input: Array<Int>, expected: Boolean) {
    val actual = checkThree(input)

    printPassOrNot(actual, expected)
}


// test-case 2: negative scenario
// test-case ???

fun printPassOrNot(actual: Boolean, expected: Boolean) {
    if (actual == expected) {
        println("TEST: PASSED")
    } else {
        println("TEST: FAILED")
    }
}