package input_output_assignment_operators

//Begin6. Paralelepepidning tomonlari a, b, c berilgan Uning hajmini V=a-b.c va to'la sirti
//S = 2-(a-b+b.c+a-c) aniqlansin.

//Begin6. Given the sides a, b, c of a parallelepiped, find its volume V=a-b.c and its total surface area
//S = 2-(a-b+b.c+a-c).


fun main() {
    println("a=")
    val a = readln().toInt()
    println("b=")
    val b = readln().toInt()
    println("c=")
    val c = readln().toInt()
    val V = a*b*c
    val S = 2*(a*b+b*c+a*c)
    println("Hajmi V=$V")
    println("To'la sirti S=$S")
}
