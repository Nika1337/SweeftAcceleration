package tasks.minsplit

import kotlin.math.min

class ComplexMinSplit {
    operator fun invoke(
        coins: IntArray,
        amount: Int
    ): Int {
        val minimalAmountForGivenAmount = MutableList(amount + 1) { if (it == 0) 0 else amount + 1 }

        (1..amount).forEach { amount ->
            coins.forEach { coin ->
                if (amount - coin >= 0) {
                    minimalAmountForGivenAmount[amount] =
                        min(minimalAmountForGivenAmount[amount], 1 + minimalAmountForGivenAmount[amount - coin])
                }
            }
        }
        return if (minimalAmountForGivenAmount[amount] != amount + 1) minimalAmountForGivenAmount[amount] else -1
    }
}