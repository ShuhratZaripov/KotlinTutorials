package input_output_assignment_operators
import kotlin.math.pow

//Begin10. Nolga teng bolmagan ikkita son berilgan.
// Ularning yig'indisini, ko'paytmasini va har birining kvadrati aniqlansin.

//Begin10. Given two non-zero numbers, find their sum, product, and square of each.

fun main() {
    println("n1=")
    val n1 = readln().toInt()
    println("n2=")
    val n2 = readln().toInt()

    val sum = n1 + n2
    val product = n1 * n2
    val square1 = n1 *n1
    val square2 = n2 *n2

    println("sum = $sum")
    println("product = $product")
    println("square1 = $square1")
    println("square2 = $square2")

}