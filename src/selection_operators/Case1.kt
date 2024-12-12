package selection_operators

fun main() {
    val dayOfWeek = readln().toInt()

    when(dayOfWeek){
        1 -> {
            println("Monday")
        }
        2 -> {
            println("Tuesday")
        }
        3 -> {
            println("Wednesday")
        }
        4 -> {
            println("Thursday")
        }
        5 -> {
            println("Friday")
        }
        6 -> {
            println("Saturday")
        }
        7 -> {
                println("Sunday")
        }
        else -> {
            println("Error")
        }
    }
}