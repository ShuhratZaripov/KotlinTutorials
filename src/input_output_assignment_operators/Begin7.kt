package input_output_assignment_operators

//Begin7. Doiraning radiusi R berilgan. Uning uzunligi L.va yuzasi S aniqlansin. L = 2• • R S = n• R°

//Begin7. Given the radius R of a circle, find its length L and its area S. L = 2• • R S = n• R°

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    println("R=")
    val R = readln().toInt()
    val L = 2 * PI * R
    val S = PI * R.toDouble().pow(2)
    println("L=$L")
    println("S=$S")
}