package input_output_assignment_operators

//Begin22. Berilgan A va B sonlarining giymatlarini almashtiring. A va B ning yangi qiymati ekranga chiqarilsin

//Begin22. Swap the values of the given numbers A and B. Print the new values of A and B on the screen

fun main(args: Array<String>) {
    println("A=")
    var a = readln().toInt()
    println("B=")
    var b = readln().toInt()

    a = b.also {b = a}

    println("New value a = $a")
    println("New value b = $b")
}