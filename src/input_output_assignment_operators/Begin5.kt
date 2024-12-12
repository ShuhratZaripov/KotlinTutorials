package input_output_assignment_operators

//Begin5. Kubning yon tomoni a berilgan. Uning hajmini V' = a va to la sirti S = 6- a aniqlansin.
//Begin5. Given a side of a cube, find its volume V' = a and its total surface area S = 6- a.
import kotlin.math.pow

fun main() {
    println("Kubning yon tomonini kiriting a=")
    val a = readln().toInt()
    val V = a.toDouble().pow(3)
    val S = 6 * a.toDouble().pow(2)
    println("V=$V")
    println("S=$S")
}