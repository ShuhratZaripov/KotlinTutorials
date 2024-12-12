package selection_operators

fun main() {

    print("Введите начальное направление робота (s, t, q, g): ")
    val direction = readln().lowercase()

    print("Введите команду (0 - продолжить, 1 - налево, 2 - направо): ")
    val command = readln().toInt()

    val directions = listOf("s", "q", "t", "g")

    val currentIndex = directions.indexOf(direction)

    if (currentIndex == -1 || command !in 0..2) {
        println("Ошибка: некорректные данные.")
        return
    }

    val newIndex = when (command) {
        0 -> currentIndex
        1 -> (currentIndex + 3) % 4
        2 -> (currentIndex + 1) % 4
        else -> currentIndex
    }

    val newDirection = directions[newIndex]

    println("Новое направление робота: $newDirection")
}
