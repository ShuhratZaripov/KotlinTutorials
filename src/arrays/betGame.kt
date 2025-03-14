import kotlin.random.Random

fun main() {
    println("Введите сумму баланса счета:")
    var balance = readln().toInt()

    println("Введите минимальную сумму ставки:")
    val minBet = readln().toInt()

    val winMultiplier = 3

    println("Игра началась! Введите сумму ставки.")

    while (balance >= minBet) {
        print("Введите сумму ставки (не меньше $minBet UZS): ")
        val input = readln()

        val currentBet = input.toIntOrNull()

        if (currentBet != null && currentBet >= minBet && currentBet <= balance) {
            balance -= currentBet
            println("Ставка: $currentBet UZS, Баланс после ставки: $balance UZS")

            if (Random.nextDouble() < 0.3) {
                val winnings = currentBet * winMultiplier
                balance += winnings
                println("Поздравляем! Вы выиграли $winnings UZS")
                println("Общий баланс: $balance UZS")
            } else {
                println("Проигрыш. Баланс: $balance UZS")
            }
        } else {
            println("Неверный ввод. Убедитесь, что сумма ставки не меньше $minBet и не превышает текущий баланс.")
        }

        if (balance < minBet) {
            println("Недостаточно средств для следующей ставки. Игра окончена.")
            break
        }
    }

    println("Итоговый баланс: $balance UZS")
}
