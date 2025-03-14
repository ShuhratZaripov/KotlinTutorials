@file:Suppress("IMPLICIT_CAST_TO_ANY")

package conditional_operators


fun main() {
    println("a=")
    val a = readln().toDouble()
    println("b=")
    val b = readln().toDouble()
    println("action:")
    val action = readln().toString()

    val result = when (action) {
        "+" -> (a + b)
        "-" -> (a - b)
        "*" -> (a * b)
        "/" -> (a / b)
        else -> println("Wrong action")
    }
    println(result)
}