package firstuniquecharinstring

fun main(): Unit {

    val str = "leetcode"
    val idx = firstUniqChar(str)

    //verify
    println(idx)
}

fun firstUniqChar(s: String): Int {
    val tmp = HashMap<Char, Int>()

    for (char: Char in s) {
        if (tmp.containsKey(char)) {
            tmp[char] = tmp[char]!!.plus(1)
        } else {
            tmp[char] = 1
        }
    }

    s.forEachIndexed { idx, char ->
        if (tmp[char] == 1) {
            return idx
        }
    }

    return -1
}