package validanagram

fun main(): Unit {

    val s = "anagram"
    val t = "nagaram"

    val isAnagram = isAnagram(s, t)

    //verify
    println(isAnagram)
}

fun isAnagram(s: String, t: String): Boolean {
    val firstMap = hashMapOf<Char, Int>()
    val secondMap = hashMapOf<Char, Int>()

    s.forEach { char -> firstMap[char] = firstMap.getOrDefault(char, 0) + 1 }
    t.forEach { char -> secondMap[char] = secondMap.getOrDefault(char, 0) + 1}

    return firstMap == secondMap
}