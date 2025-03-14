package conditional_operators

//Yil berilgan (musbat butun son). Berilgan yilda nechta kun borligini aniqlovchi
//programma tuzilsin. Kabisa yilida 366 kun bor, kabisa bo’lmagan yilda 365 kun bor.
//Kabisa yil deb 4 ga karrali yillarga aytiladi. Lekin 100 ga karrali yillar ichida faqat 400
//ga karrali bo’lganlari kabisa yil hisoblanadi. Masalan 300, 1300 va 1900 kabisa yili
//emas. 1200 va 2000 kabisa yili.

//Given a year (positive integer).
//Write a program that determines how many days there are in a given year.
//A leap year has 366 days, and a non-leap year has 365 days.
// Leap years are years that are multiples of 4.
// However, among years that are multiples of 100, only those that are multiples of 400 are considered leap years.
// For example, 300, 1300, and 1900 are not leap years. 1200 and 2000 are leap years.

fun main() {
    println("Input the number of year")
    val year = readln().toIntOrNull()

    if (year != null && year > 0) {
        val isLeap = kabisaYear(year)
        val daysInYear = if (isLeap) 366 else 365
        println("In year has $year $daysInYear days")
    }else{
        println("Input the correct integer number")
    }
}
fun kabisaYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
//fun main() {
//    println("Введите год:")
//    val year = readln().toIntOrNull()
//
//    if (year != null && year > 0) {
//        val daysInYear = if (isLeapYear(year)) 366 else 365
//        println("В году $year $daysInYear дней.")
//    } else {
//        println("Введите корректное положительное целое число.")
//    }
//}
//
//fun isLeapYear(year: Int): Boolean {
//    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//}

