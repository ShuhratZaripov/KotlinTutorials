package input_output_assignment_operators

//Begin3. To g'ri to rtburchakning tomonlari a va b berilgan.
// Uning yuzasi S = a *b; va P = 2* (a + b) perimetri aniqlansin.

//Begin3. Given sides a and b of a right-angled rectangle,
// find its area S = a * b; and its perimeter P = 2* (a + b).

fun main() {
    println("a ni kiriting")
    val a = readln().toInt()
    println("b ni kiriting")
    val b = readln().toInt()

    val S = a * b
    val P = 2 * (a + b)

    println("To'rtburchak yuzasi S=$S")
    println("To'rtburchak perimetri P=$P")
}