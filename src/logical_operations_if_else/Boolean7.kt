package logical_operations_if_else

fun main() {
    println("A=")
    val a = readln().toInt()
    println("B=")
    val b = readln().toInt()
    println("C=")
    val c = readln().toInt()

    if (a <b && b < c){
        println("True")
    }
    else{
        println("false")
    }
}