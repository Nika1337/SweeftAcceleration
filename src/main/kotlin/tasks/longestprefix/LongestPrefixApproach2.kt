package tasks.longestprefix

class LongestPrefixApproach2 : LongestPrefix {
    override operator fun invoke(array: Array<String>): String {
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
}