package tasks.longestprefix

import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestPrefixTest {
    private lateinit var longestPrefix: LongestPrefix

    @BeforeEach
    fun initialize() {
        longestPrefix = LongestPrefix()
    }

    @Test
    fun longestPrefix_invokeOnEmptyArray_ReturnsEmptyString() {
        val testArray = arrayOf<String>()
        val expectedValue = ""
        val actualValue1 = longestPrefix.approach1(testArray)
        val actualValue2 = longestPrefix.approach2(testArray)
        val actualValue3 = longestPrefix.approach3(testArray)
        assertEquals(expectedValue, actualValue1)
        assertEquals(expectedValue, actualValue2)
        assertEquals(expectedValue, actualValue3)

    }

    @Test
    fun longestPrefix_invokeOnOneElementArray_returnsTheElement() {
        val testArray = arrayOf("bagqagah")
        val expectedValue = testArray[0]
        val actualValue1 = longestPrefix.approach1(testArray)
        val actualValue2 = longestPrefix.approach2(testArray)
        val actualValue3 = longestPrefix.approach3(testArray)
        assertEquals(expectedValue, actualValue1)
        assertEquals(expectedValue, actualValue2)
        assertEquals(expectedValue, actualValue3)
    }

    @Test
    fun longestPrefix_invokeManyTimes_AllReturnCorrectResult() {
        val testArrays = listOf(
            arrayOf("flower", "flow", "flight"),
            arrayOf("dog", "racecar", "car"),
            arrayOf("")
        )
        val expectedValues = listOf(
            "fl",
            "",
            ""
        )
        val actualValues1 = List(testArrays.size) { index -> longestPrefix.approach1(testArrays[index]) }
        val actualValues2 = List(testArrays.size) { index -> longestPrefix.approach2(testArrays[index]) }
        val actualValues3 = List(testArrays.size) { index -> longestPrefix.approach3(testArrays[index]) }
        assertEquals(expectedValues, actualValues1)
        assertEquals(expectedValues, actualValues2)
        assertEquals(expectedValues, actualValues3)
    }
}