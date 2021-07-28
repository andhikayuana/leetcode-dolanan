package reverseinteger

fun main() {
    val num = 1234
    val reversed = reverse(num)

    //verify
    println(reversed)
}

fun reverse(x: Int): Int {

    var num = x
    var reversed = 0

    while (num != 0) {
        val perDigit = num % 10

        // Int.MAX_VALUE=2147483647
        // reversed > Int.MAX_VALUE / 10 -> assumption if reversed > 7 that number from MAX_VALUE
        // or
        // reversed == Int.MAX_VALUE / 10 -> assumption if reversed = 7 that number from MAX_VALUE and perdigit > 7
        if (reversed > Int.MAX_VALUE / 10 || (reversed == Int.MAX_VALUE / 10 && perDigit > 7)) {
            return 0
        }

        //Int.MIN_VALUE=-2147483648
        if (reversed < Int.MIN_VALUE / 10 || (reversed == Int.MIN_VALUE / 10 && perDigit < -8)) {
            return 0
        }
        reversed = reversed * 10 + perDigit
        num /= 10
    }

    return reversed
}