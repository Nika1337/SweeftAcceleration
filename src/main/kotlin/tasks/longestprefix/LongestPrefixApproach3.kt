package tasks.longestprefix

import kotlin.math.min

class LongestPrefixApproach3 : LongestPrefix {
    override operator fun invoke(array: Array<String>): String {
        if (array.isEmpty()) return ""

        val sortedArray = array.sorted()

        val first = sortedArray.first()
        val last = sortedArray.last()

        val minLength = min(first.length, last.length)

        var longestPrefixLength = 0
        repeat(minLength) {
            if (first[it] == last[it]) {
                longestPrefixLength++
            } else {
                return first.substring(0, longestPrefixLength)
            }
        }
        return first.substring(0, longestPrefixLength)
    }
}