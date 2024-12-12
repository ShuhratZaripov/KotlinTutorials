package conditional_operators

fun main() {
    println("n1, n2, n3")
    val (n1, n2, n3) = readln().split(" ").map { it.toInt() }

    val minNumber = minOf(n1, n2, n3)

    if (minNumber>0){
        println("minimal number:$minNumber")
    }
    else{
        println("all numbers are equal")
    }
}