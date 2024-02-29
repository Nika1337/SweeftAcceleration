package tasks.longestprefix

class LongestPrefixApproach1 : LongestPrefix {
    override operator fun invoke(array: Array<String>): String {
        return array.reduceOrNull { acc, char ->
            longestPrefix(acc, char)
        } ?: ""
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