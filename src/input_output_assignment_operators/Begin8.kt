package input_output_assignment_operators

//Begin8. Ikkita son a va b berilgan. Ularning o'rta arifmetigi aniqlansin. (a+ b) / 2

//Begin8. Given two numbers a and b. Find their arithmetic mean. (a+ b) / 2

fun main() {
    println("a=")
    val a = readln().toDouble()
    println("b=")
    val b = readln().toDouble()
    val average = (a + b)/2.0
    println("Average = $average")
}