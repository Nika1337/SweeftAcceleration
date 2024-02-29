package tasks.minsplit

interface MinSplit {
    operator fun invoke(
        amount: Int
    ): Int
}