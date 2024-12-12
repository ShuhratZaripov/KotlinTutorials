package input_output_assignment_operators

import kotlin.math.sqrt

// Begin15. Aylananing yuzasi S berilgan. Uning diametri d va radiusi R aniqlansin
//  S = pi*R^2
// pi = 3.14

//Begin15. Given the area S of a circle, find its diameter d and radius R
//S = pi*R^2 pi = 3.14

fun main(args: Array<String>) {
    println("S=")
    val S = readln().toInt()
    val Pi = 3.14

    val R = sqrt(S/Pi)
    val d = 2*R

    println("R = $R")
    println("d = $d")
}