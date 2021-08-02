package test2

import kotlin.math.abs

fun main() {

    val input1 = listOf<String>("23:59", "00:00")
    val expected1 = 1

    val input2 = listOf<String>("00:00", "23:59", "00:00")
    val expected2 = 0

    val input3 = listOf<String>("00:00", "12:00", "12:01", "23:50")
    val expected3 = 1

    val input4 = listOf<String>("22:00", "21:00", "23:00", "00:00", "00:30")
    val expected4 = 30

    val input5 = listOf<String>("22:00", "21:00")
    val expected5 = 60

    callAction(input1, expected1)
    callAction(input2, expected2)
    callAction(input3, expected3)
    callAction(input4, expected4)
    callAction(input5, expected5)
}

fun callAction(timePoints: List<String>, expected: Int) {

    val output = findMinDifference(timePoints)

    println("OUTPUT:")
    println(output)
    println("EXPECTED: $expected")
    println("PASS: ${output == expected}")
    println("ENDOF")
    println()
}

fun findMinDifference(timePoints: List<String>): Int {
    //convert to minutes
    val converted = timePoints.map {
        val time = it.split(":")
        (time[0].toInt() * 60) + time[1].toInt()
    }.sorted()

    println(converted)
    val minutesInADay = 1440
    var tmpMinDiff = minutesInADay - converted[converted.size - 1] + converted[0]
    for (index in converted.indices) {
        if (index == converted.size - 1) {
            break
        }
        val tmpDiff = abs(converted[index + 1] - converted[index])
        if (tmpDiff < tmpMinDiff) {
            tmpMinDiff = tmpDiff
        }

    }
    return tmpMinDiff
}