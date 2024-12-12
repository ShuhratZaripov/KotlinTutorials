package logical_operations_if_else
    
fun main() {
    println("A=")
    val a = readln().toInt()
    if (a in 100 .. 999) {

        val firstDigit = a / 100
        val secondDigit = (a / 10) % 10
        val thirdDigit = a % 10

        if (firstDigit < secondDigit && secondDigit < thirdDigit) {
            println("Digits of number $a are in ascending order")
        } else {
            println("Digits of number $a are NOT in ascending order")

        }
    }
    else{
        println("Given number is not three-digit number ")
    }
}