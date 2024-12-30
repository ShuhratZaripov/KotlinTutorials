package selection_operators

fun main() {
    val n = readln().toInt()
    var number = -1.1
    var counter = 1
    var sum = 0.0
    while (counter < n) {
        sum+=(-1) * number
        number+=0.1
        counter++
    }
    println("Sum:$sum")

}