package conditional_operators

fun main() {
    println("Type 3 numbers with space")
    val (n1, n2, n3) = readln().split(" ").map { it.toInt() }

    val positiveNumbers = listOf(n1, n2, n3).filter {it > 0}

    if (positiveNumbers.isNotEmpty()){
        println("Positive numbers: ${positiveNumbers.joinToString(" and ")}")
    }
    else{
        println("There is no positive number")
    }
}