package tasks.countvariants

class CountVariantsApproach2 : CountVariants {
    override fun invoke(stairsCount: Int): Int {
        if (stairsCount == 0 || stairsCount == 1) return 1
        var previous = 1
        var current = 1
        for (i in 2..stairsCount) {
            val temp = current
            current += previous
            previous = temp
        }
        return current
    }
}