package for_cycle

//S=n^2+（n+1)^2+（n+2)^2+...（2*n)^2

fun main() {
    print("input n: ")
    val n = readln().toInt()

    var sum= 0

    for (i in n..2 * n) {
        sum += i * i
    }

    println("Sum: $sum")
}