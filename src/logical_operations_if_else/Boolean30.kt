package logical_operations_if_else

fun main() {
    println("a=")
    val a = readln().toInt()
    println("b=")
    val b = readln().toInt()
    println("c=")
    val c = readln().toInt()

    if (a == b && b == c){
        println("A triangle with sides $a, $b, $c is equilateral")
    }
    else{
        println("A triangle with sides $a, $b, $c is not equilateral")
    }
}