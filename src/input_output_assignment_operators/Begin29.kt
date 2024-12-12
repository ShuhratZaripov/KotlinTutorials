package input_output_assignment_operators

import kotlin.math.PI

//Begin29. a burchak gradusda berilgan (10° < a < 360°) - Berilgan burchakning qiymatini radianga o'tkazuchi programma tuzilsin.

//Begin29. Angle a is given in degrees (10° < a < 360°) - Write a program that converts the value of the given angle to radians.

fun main(args: Array<String>) {
    println("Gradus=")
    val c = readln().toInt()

    val r = c* PI/180

    println("$r Radian")

}