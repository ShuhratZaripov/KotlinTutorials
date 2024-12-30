package for_cycle

// Sum = 1 + 1/2 ... +1/n

fun main() {
    val n = readln().toInt()
    var sum =0.0

    for (i in 1..n) {
        sum += 1.0/i
    }
    println(String.format("%.3f",sum))
}