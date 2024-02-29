package tasks.countvariants

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CountVariantsTest {
    private lateinit var countVariantsApproach1: CountVariantsApproach1
    private lateinit var countVariantsApproach2: CountVariantsApproach2

    @BeforeEach
    fun initialize() {
        countVariantsApproach1 = CountVariantsApproach1()
        countVariantsApproach2 = CountVariantsApproach2()
    }

    @Test
    fun countVariants_invokeOnZero_returnsOne() {
        val testCount = 0
        val expectedValue = 1
        val actualValue1 = countVariantsApproach1(testCount)
        val actualValue2 = countVariantsApproach2(testCount)
        assertEquals(expectedValue, actualValue1)
        assertEquals(expectedValue, actualValue2)
    }

    @Test
    fun countVariants_invokeOnOne_returnsOne() {
        val testCount = 1
        val expectedValue = 1
        val actualValue1 = countVariantsApproach1(testCount)
        val actualValue2 = countVariantsApproach2(testCount)
        assertEquals(expectedValue, actualValue1)
        assertEquals(expectedValue, actualValue2)
    }

    @Test
    fun countVariants_invoke_returnsCorrectResult() {
        val testCounts = listOf(
            2,
            3,
            10,
            25,
            14
        )
        val expectedValues = listOf(
            2,
            3,
            89,
            121393,
            610
        )
        val actualValues1 = List(testCounts.size) { index -> countVariantsApproach1(testCounts[index]) }
        val actualValues2 = List(testCounts.size) { index -> countVariantsApproach2(testCounts[index]) }
        assertEquals(expectedValues, actualValues1)
        assertEquals(expectedValues, actualValues2)
    }

}