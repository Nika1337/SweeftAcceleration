package tasks.longestprefix

import kotlin.math.min

class LongestPrefix {
    fun approach1(array: Array<String>): String {
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

    fun approach2(array: Array<String>): String {
        if (array.isEmpty()) return ""
        var currentLongestPrefixIndex = 0
        while (true) {
            val chars = array.map { it.getOrNull(currentLongestPrefixIndex)  }
            val currentChar = chars[0]
            if (chars.any { it != currentChar || it == null }) break
            currentLongestPrefixIndex++
        }
        return array[0].substring(0, currentLongestPrefixIndex)
    }

    fun approach3(array: Array<String>): String {
        return array.reduce { acc, char ->
            longestPrefix(acc, char)
        }
    }

    private fun longestPrefix(acc: String, char: String): String {
        var longestPrefixLength = 0
        while(longestPrefixLength < acc.length && longestPrefixLength < char.length) {
            if (acc[longestPrefixLength] == char[longestPrefixLength]) {
                longestPrefixLength++
            } else {
                return acc.substring(0, longestPrefixLength)
            }
        }
        return acc.substring(0, longestPrefixLength)
    }
}
