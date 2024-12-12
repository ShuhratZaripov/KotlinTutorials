package input_output_assignment_operators

//Begin9. Ikkita manfiy bo Imagan son a va b berilgan. Ularing o ita geometrigi aniqlansin.

//Begin9. Given two non-negative integers a and b. Determine their geometric mean.

import kotlin.math.sqrt

fun main() {
    println("a=")
    val a = readln().toDouble()
    println("b=")
    val b = readln().toDouble()
    val geo = sqrt(a*b)
    println(geo)

}