const val COMMISSION = 3500
const val COMMISSION_PROCENT = 0.0075
fun main(args: Array<String>) {
    print("Введите сумму перевода: ")

    val amountRub = readLine()!!.toInt()
    val amountPenny = amountRub * 100
    val finalPrice = amountPenny - COMMISSION
    val totalCommission = amountPenny * COMMISSION_PROCENT
    val totalPrice = if (totalCommission < COMMISSION) finalPrice else amountPenny - totalCommission
    println("Комиссия составила $totalCommission коп.")

}