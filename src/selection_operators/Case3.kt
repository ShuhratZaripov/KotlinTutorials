package selection_operators

fun main() {
    val monthOfYear = readln().toInt()

    when(monthOfYear){
        1,2,12 -> {
            println("Winter")
        }
        3,4,5 -> {
            println("Spring")
        }
        6,7,8 -> {
            println("Summer")
        }
        9,10,11 -> {
            println("Autumn")
        }
        else -> {
            println("Error")
        }
    }
}