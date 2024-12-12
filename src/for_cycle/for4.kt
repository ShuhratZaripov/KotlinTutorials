package for_cycle

fun main() {
    println("Price of 1 kg coffee")
    val price = readln().toInt()
    println("Total kg coffee")
    val n  = readln().toInt()

    for (kg in 1..n) {
        println("price of $kg kg coffee ${kg*price}")
    }
}