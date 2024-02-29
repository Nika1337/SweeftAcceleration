package tasks.singlenumber

class DefaultSingleNumber : SingleNumber {
    override operator fun invoke(nums: IntArray): Int {
        if (nums.isEmpty()) return -1
        return nums.fold(0) { acc, num -> acc xor num }
    }
}