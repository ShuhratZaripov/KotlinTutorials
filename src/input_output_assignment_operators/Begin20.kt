package input_output_assignment_operators

import kotlin.math.sqrt
import kotlin.math.pow

//Begin20. Tekislikdagi berilgan ikki nuqta (x1, y1) va (x2, y2) orasidagi masofa topilsin.

//Begin20. Find the distance between two given points (x1, y1) and (x2, y2) on the plane.

fun main(args: Array<String>) {
    println("x1")
    val x1 = readln().toDouble()
    println("y1")
    val y1 = readln().toDouble()
    println("x2")
    val x2 = readln().toDouble()
    println("y2")
    val y2 = readln().toDouble()

    val result = sqrt((x2-x1).pow(2) + (y2 - y1).pow(2))

    println("result= $result")



}