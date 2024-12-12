package logical_operations_if_else

fun main() {
     println("Please type any integer")

     val number = readln().toInt()

     if (number > 0){
          println("given number is positive")
     }
     else{
          println("given number is negative")
     }
}