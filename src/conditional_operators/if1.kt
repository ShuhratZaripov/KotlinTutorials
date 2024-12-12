package conditional_operators

fun main() {
    var n = readln().toInt()

    if (n > 0) {
        n++
    }
    else{
        println("Not changed")
    }

    println("Current number $n")
}