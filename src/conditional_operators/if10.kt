package conditional_operators

fun main() {
    println("a and b")
    var (a, b) = readln().split(" ").map { it.toInt() }

    if (a != b){
        val sum = a + b
        a = sum
        b = sum
        println("a= $a, b=$b")
    }
    else if (a == b){
        a = 0
        b = 0
    println("a= $a, b=$b")
    }
}