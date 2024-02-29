package tasks.countvariants

class CountVariantsApproach1 : CountVariants {
    override operator fun invoke(stairsCount: Int): Int {
        if (stairsCount == 0 || stairsCount == 1) return 1
        val variantsForGivenStairsCount = MutableList(stairsCount + 1) { 1 }
        for (i in 2..stairsCount) {
            variantsForGivenStairsCount[i] = variantsForGivenStairsCount[i-1] + variantsForGivenStairsCount[i - 2]
        }
        return variantsForGivenStairsCount[stairsCount]
    }
}