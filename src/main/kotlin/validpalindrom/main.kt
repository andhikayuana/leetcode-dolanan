package validpalindrom

fun main(): Unit {
    val input = "A man, a plan, a canal: Panama"
    val expected = true

    val input2 = "race a car"
    val expected2 = false

    val output = isPalindrome(input2)
    println("--")
    println(output)
}

/**
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
fun isPalindrome(s: String): Boolean {
    val alphaNumericOnly = s.toCharArray()
        .filter { it.isLetterOrDigit() }
        .joinToString(separator = "")
        .toLowerCase()

    var ptrLeft = 0
    var ptrRight = alphaNumericOnly.length - 1

    while (ptrLeft <= ptrRight) {

        val charLeft = alphaNumericOnly[ptrLeft]
        val charRight = alphaNumericOnly[ptrRight]

        if (charLeft != charRight) {
            return false
        }

        ptrLeft++
        ptrRight--
    }

    return true
}