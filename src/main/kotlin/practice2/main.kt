package practice2

fun main(): Unit {

    val S = "00-44  48  5555  8361"
    val S2 = "0 - 22 1985--324"
    val S3 = "555372654"

    val expected = "004-448-555-583-61"


    val actual = solution(S2)

    println(actual)

}

fun solution(s: String): String {
    //example pattern
    //14 -> xxx-xxx-xxx-xxx-xx | 14 % 3 = 2
    //10 -> xxx-xxx-xx-xx | 10 % 3 = 1
    //9 -> xxx-xxx-xxx | 9 % 3 = 0

    val trimmed = s.replace(" ", "").replace("-", "")

    //two digit just return
    if (trimmed.length == 2) {
        return trimmed
    }

    var formatted = ""

    for (index in trimmed.indices) {
        val c = trimmed[index]
        formatted = formatted.plus(c)

        if (trimmed.length % 3 == 2 || trimmed.length % 3 == 0) {
            if ((index + 1) % 3 == 0 && index + 1 < trimmed.length) {
                formatted = formatted.plus('-')
            }
        } else {
            if (index > trimmed.length - 4 && index < trimmed.length - 1) {
                if (index % 2 != 0 ) {
                    formatted = formatted.plus('-')
                }

            } else

                if ((index + 1) % 3 == 0 && index + 1 < trimmed.length) {
                    formatted = formatted.plus('-')
                }
        }
    }

    return formatted
}