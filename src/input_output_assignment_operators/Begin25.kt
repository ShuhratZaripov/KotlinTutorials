package input_output_assignment_operators

//Begin25.x ning giymati berilganda y= 3x^5 - 6x^2 -7 funksiyaning giymati aniqlansin.

//Begin25. Given the value of x, find the value of the function y= 3x^5 - 6x^2 -7.

import kotlin.math.pow

fun main(args: Array<String>) {
    println("x=")
    val x = readln().toDouble()
    val y = (3 * x.pow(5)-6*x.pow(2)-7).toInt()

    println("y = $y")
}