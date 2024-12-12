package logical_operations_if_else

fun main() {
    println("x1 and y1")
    val (x1, y1) = readln().split(" ").map { it.toInt() }

    println("x2 and y2")
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    if ( x1 !in 1 ..8 || y1 !in 1..8 || x2 !in 1..8 || y2 !in 1..8){
        println("Error: coordination should be between 1 and 8")
    }

    if ((x1 + y1) % 2 == (x2 + y2) % 2){
        println("Given coordinations are same color")
    }
    else{
        println("Given coordinations are not same color")
    }
}
