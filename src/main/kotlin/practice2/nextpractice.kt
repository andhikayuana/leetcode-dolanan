//package practice2
//
//fun main() {
//
//    val Y = 2014
//    val A = "April"
//    val B = "May"
//    val W = "Wednesday"
//
//    val expected = 7
//    val output = solution(Y, A, B, W)
//}
//
//fun solution(Y: Int, A: String, B: String, W: String): Int {
//    // write your code in Kotlin 1.3.11 (Linux)
//
//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    val months = arrayOf(
//        "January",
//        "February",
//        "March",
//        "April",
//        "May",
//        "June",
//        "July",
//        "August",
//        "September",
//        "October",
//        "November",
//        "December"
//    )
//    val lengthOfMonth = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//    val lengthOfMonthLeap = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//
//    //search 1st day of A (started month) with helps from W -> Jan 1st of Y (year)
//    val firstJanuary = DateModel(W, 1, Y)
//
//
//
//    val firstA = months.forEach {
//        if (it == A) {
//            if (Y % 4 == 0) {
//                //using lengthOfMonthLeap
//
//            } else {
//                //using lengthOfMonth
//            }
//        }
//    }
//
//
//}
//
//data class DateModel(
//    val dayName: String,
//    val date: Int,
//    val year: Int
//)