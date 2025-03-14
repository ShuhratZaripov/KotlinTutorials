package conditional_operators

//Uchta son berilgan. Shu sonlarning kichigini aniqlovchi programma tuzilsin.

//Given three numbers, write a program to find the smallest of these numbers.

fun main() {
    println("Type 3 numbers within space")
    var (n1, n2, n3) = readln().split(" ").map { it.toInt() }

    if (n1<n2 || n1<n3){
        println("The smallest number is $n1")
    }
    else if (n2<n3){
        println("The smallest number is $n2")
    }
    else
        println("The smallest number is $n3")
}