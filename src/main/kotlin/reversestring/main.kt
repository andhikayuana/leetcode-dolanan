package reversestring

fun main() {
    val str = "hello"
    reverseString(str.toCharArray())
}

fun reverseString(s: CharArray): Unit {
    var pointer1 = 0
    var pointer2 = s.size - 1

    while (pointer1 < pointer2) {
        val tmp = s[pointer1]
        s[pointer1] = s[pointer2]
        s[pointer2] = tmp

        pointer1 += 1
        pointer2 -= 1
    }

    //verify
    println(s)
}

