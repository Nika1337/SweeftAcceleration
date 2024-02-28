package tasks.minsplit

class SimpleMinSplit {
    private val coins = intArrayOf(50, 20, 10, 5, 1)
    operator fun invoke(
        amount: Int
    ): Int {
        var amountOfCoins = 0
        var amount = amount
        coins.forEach { coin ->
            amountOfCoins += amount / coin
            amount %= coin
        }
        return amountOfCoins
    }
}