package tasks.minsplit

import kotlin.math.min

class ComplexMinSplit(
    val coins: IntArray = intArrayOf(50, 20, 10, 5, 1)
) : MinSplit{

    override operator fun invoke(
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