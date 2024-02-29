package tasks.minsplit

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ComplexMinSplitTest {

    private lateinit var complexMinSplit: ComplexMinSplit
    private val coins = intArrayOf(50, 20, 10, 5, 1)
    @BeforeEach
    fun initialize() {
        complexMinSplit = ComplexMinSplit(coins)
    }
    @Test
    fun complexMinSplit_amountZero_returnsZero() {
        val testAmount = 0
        val expectedValue = 0
        val actualValue = complexMinSplit(testAmount)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun complexMinSplit_correctAmounts_returnsCorrectAnswer() {
        val testAmounts = listOf(99, 100, 125, 169, 144, 83, 80)
        val expectedValues = listOf(
            8,
            2,
            4,
            9,
            8,
            6,
            3
        )
        val actualValues = List(testAmounts.size) { index -> complexMinSplit(testAmounts[index]) }
        assertEquals(expectedValues, actualValues)
    }
}