package logical_operations_if_else

import kotlin.math.abs

fun main() {
    println("x1 and y1")
    val (x1, y1) = readln().split(" ").map { it.toInt() }

    println("x2 and y2")
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    if (x1 !in 1..8 || y1 !in 1..8 || x2 !in 1..8 || y2 !in 1..8) {
        println("Error: coordination should be between 1 and 8")
    }

    val canMove1 = abs(x2 - x1) == 1 && abs(y2 - y1) == 2
    val canMove2 = abs(x2 - x1) == 2 && abs(y2 - y1) == 1

    if (canMove1 || canMove2){
        println("Horse can move")
    }
    else{
        print("Horse cannot move")
    }
}
