package selection_operators

fun main() {
    println("Unit of length=")
    val unitOfLength = readln().toInt()
    println("Length=")
    val length = readln().toInt()

    when(unitOfLength){
        1 -> {
            val inDecimeter = length / 10
            println("$inDecimeter m")
        }
        2 -> {
            val inKilometer = length * 1000
            println("$inKilometer m")
        }
        3 -> {
            val inMeter = length * 1
            println("$inMeter m")
        }
        4 -> {
            val inMillimeter = length / 1000
            println("$inMillimeter m")
        }
        5 -> {
            val inCentimeter = length / 100
            println("$inCentimeter m")
        }
        else -> {
            println("Error")
        }
    }
}