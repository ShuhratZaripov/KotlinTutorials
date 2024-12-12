package logical_operations_if_else
import kotlin.math.pow

fun main() {
    println("A=")
    val a = readln().toInt()
    println("B=")
    val b = readln().toInt()
    println("C=")
    val c = readln().toInt()

    val discriminate = b.toDouble().pow(2) - 4 * a * c

    if (discriminate >= 0){
        println("Given quadratic equation has root")
    }
    else {
        println("Given quadratic equation has not root")
    }
}