package math

fun main() {

    val input1 = 3
    val input2 = 5
    val input3 = 15
    val input4 = 10000

    println(fizzBuzz(input1))
    println(fizzBuzz(input2))
    println(fizzBuzz(input3))
    println(fizzBuzz(input4))

}

//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i if non of the above conditions are true.
fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()

    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            result.add("FizzBuzz")
        } else if (i % 3 == 0) {
            result.add("Fizz")
        } else if (i % 5 == 0) {
            result.add("Buzz")
        } else {
            result.add(i.toString())
        }
    }

    return result
}

//approach2
fun fizzBuzz2(n: Int): List<String> = (1..n).map {
    if (it % 3 == 0 && it % 5 == 0) {
        "FizzBuzz"
    } else if (it % 3 == 0) {
        "Fizz"
    } else if (it % 5 == 0) {
        "Buzz"
    } else {
        it.toString()
    }
}