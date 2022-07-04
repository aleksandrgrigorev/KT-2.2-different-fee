fun main() {
    val transactionThisMonth = 75600

    println("""Выберите тип вашей карты:
    1 - MasterCard/Maestro;
    2 - Visa/Мир;
    прочее - VK Pay""")

    val cardType = try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        3
    }

    println("Сколько рублей Вы хотите перевести?")
    val amount = readln().toInt()

    println("Комиссия составит: ${fee(transactionThisMonth, amount, cardType)} коп.")
}

fun fee(transactionThisMonth: Int, amount: Int, cardType: Int): String {
    val feePercentCard1Type = 0.006
    val card1TypeFee = amount * feePercentCard1Type + 20_00
    val maxMonthlyTransaction = 75000

    val feePercentCard2Type = 0.0075

    return when (cardType) {
        1 -> if (transactionThisMonth < maxMonthlyTransaction) "0" else card1TypeFee.toInt().toString()
        2 -> (amount * feePercentCard2Type).toInt().toString()
        else -> "0"
    }
}