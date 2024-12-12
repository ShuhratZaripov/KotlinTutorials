package logical_operations_if_else

fun main() {
    println("A=")
    val a = readln().toInt()
    println("B=")
    val b = readln().toInt()

    if (a > 2 && b <= 3){
        println("true")
    }
    else{
        println("false")
    }
}