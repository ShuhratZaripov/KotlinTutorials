package logical_operations_if_else

fun main() {
    println("A=")
    val a = readln().toInt()
    println("B=")
    val b = readln().toInt()

    if ((a % 2 !=0) xor (b % 2 != 0 )){
        println("One of them odd")
    }
    else {
        println("all of them odd")
    }
}