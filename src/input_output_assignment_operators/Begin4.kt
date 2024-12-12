package input_output_assignment_operators

//Begin4. Aylananing diametri d berilgan. Uning uzunligi aniqlansin L = n- d
// p= 3.14

//Begin4. The diameter of a circle is given by d. Find its length L = n- d
// p = 3.14

fun main() {
    println("Aylananing diametrini kiriting d")
    val pi = 3.14
    val d = readln().toInt()
    val L = pi*d
    println("Aylananing uzunigi L=$L")
}