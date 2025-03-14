@file:Suppress("UNUSED_EXPRESSION")

package conditional_operators

fun main() {
    println("Input the number of the month")
    val month = readln().toInt()

    when (month){
        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("Aprel")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")
        else -> "This number of month doesn't exist"
    }
}