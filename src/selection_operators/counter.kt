package selection_operators

fun main() {
    var counter = 1
    var sum = 0

     do {
        println(counter)
        sum+=counter
        counter++
    }while(counter <=10)
    println("Total sum:$sum")
}