package logical_operations_if_else

fun main() {
    println("Type negative integer")
    val a = readln().toInt()

    val isNegativeTwoDigitNumber = (a < 0) && (a in -99 .. -10) && (a % 2 == 0)

    if (isNegativeTwoDigitNumber){
        println("true")
    }
    else{
        println("false")
    }
}