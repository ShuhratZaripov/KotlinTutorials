package selection_operators

fun main() {
    var sum = 0
    for (counter in 3..100 step 3) {
        sum += counter
    }
    println(sum)
}