package tasks.longestprefix

import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestPrefixTest {
    private lateinit var longestPrefixApproach1: LongestPrefixApproach1
    private lateinit var longestPrefixApproach2: LongestPrefixApproach2
    private lateinit var longestPrefixApproach3: LongestPrefixApproach3

    @BeforeEach
    fun initialize() {
        longestPrefixApproach1 = LongestPrefixApproach1()
        longestPrefixApproach2 = LongestPrefixApproach2()
        longestPrefixApproach3 = LongestPrefixApproach3()
    }

    @Test
    fun longestPrefix_invokeOnEmptyArray_ReturnsEmptyString() {
        val testArray = arrayOf<String>()
        val expectedValue = ""
        val actualValue1 = longestPrefixApproach1(testArray)
        val actualValue2 = longestPrefixApproach2(testArray)
        val actualValue3 = longestPrefixApproach3(testArray)
        assertEquals(expectedValue, actualValue1)
        assertEquals(expectedValue, actualValue2)
        assertEquals(expectedValue, actualValue3)

    }

    @Test
    fun longestPrefix_invokeOnOneElementArray_returnsTheElement() {
        val testArray = arrayOf("bagqagah")
        val expectedValue = testArray[0]
        val actualValue1 = longestPrefixApproach1(testArray)
        val actualValue2 = longestPrefixApproach2(testArray)
        val actualValue3 = longestPrefixApproach3(testArray)
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
        val actualValues1 = List(testArrays.size) { index -> longestPrefixApproach1(testArrays[index]) }
        val actualValues2 = List(testArrays.size) { index -> longestPrefixApproach2(testArrays[index]) }
        val actualValues3 = List(testArrays.size) { index -> longestPrefixApproach3(testArrays[index]) }
        assertEquals(expectedValues, actualValues1)
        assertEquals(expectedValues, actualValues2)
        assertEquals(expectedValues, actualValues3)
    }
}