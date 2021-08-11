package test2

fun main() {

    val input1 = mapOf(
        "a" to listOf(1, 2, 3),
        "b" to listOf(1, 2),
        "c" to listOf(1, 2)
    )
    val expected1 = arrayOf(arrayOf("a"), arrayOf("b", "c"))
    val user1 = 1

    val input2 = mapOf(
        "a" to listOf(1, 3, 5),
        "b" to listOf(3, 5),
        "c" to listOf(2, 3, 4, 5),
        "d" to listOf(3, 5)
    )
    val user2 = 3

    val output1 = findMergeChannels(input1)
    println(output1.toString())

    val output2 = findMergeChannels(input2)
    println(output2.toString())

//
    println("==")

    println(findMinMention(input1, user1))
    println(findMinMention(input2, user2))

//

    println("==")

    println(findChannelsMentionAllUsers(input1))


}

/**
 * variable result
 * for (ch1 in channels) {
 *   variable merged
 *   for (ch2 in channels) {
 *     if (ch1.users == ch2.users) {
 *       merged.add(ch2.name)
 *     }
 *   }
 *
 *   if (!result.contains(merged)) {
 *     result.add(merged)
 *   }
 * }
 *
 *
 */
fun findMergeChannels(channels: Map<String, List<Int>>): List<List<String>> {
    val result = mutableListOf<List<String>>()
    for (c in channels) {
        val merged = mutableListOf<String>()
        for (c2 in channels) {
            if (c.value == c2.value) {
                merged.add(c2.key)
            }
        }

        if (!result.contains(merged)) {
            result.add(merged.toList())
        }
    }

    return result
}

fun findMinMention(channels: Map<String, List<Int>>, user: Int): List<String> {
    val result = hashMapOf<String, Int>()
    for (c in channels) {
        if (c.value.contains(user)) {
            val count = c.value.size - 1
            result[c.key] = count
        }
    }

    val minVal = result.minByOrNull { it.value }?.value
    return result.filterValues { it == minVal }.map { it.key }
}


fun findChannelsMentionAllUsers(channels: Map<String, List<Int>>): List<List<String>> {

    //all users
    val users = mutableListOf<Int>()
    for (c in channels) {
        for (u in c.value) {
            if (!users.contains(u)) {
                users.add(u)
            }
        }
    }

    val result = mutableListOf<List<String>>()
    for (u in users) {
        for (c in channels) {
            for (member in c.value) {

            }
        }
    }

    return listOf()
}