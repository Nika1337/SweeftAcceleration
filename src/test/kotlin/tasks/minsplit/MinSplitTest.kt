package tasks.minsplit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MinSplitTest {
    private lateinit var complexMinSplit: ComplexMinSplit
    private lateinit var simpleMinSplit: SimpleMinSplit
    private val coins = intArrayOf(50, 20, 10, 5, 1)

    @BeforeEach
    fun initialize() {
        simpleMinSplit = SimpleMinSplit()
        complexMinSplit = ComplexMinSplit(coins)
    }

    @Test
    fun minSplit_amountZero_returnsZero() {
        val testAmount = 0
        val expectedValue = 0
        val actualValueComplex = complexMinSplit(testAmount)
        val actualValueSimple = simpleMinSplit(testAmount)
        assertEquals(expectedValue, actualValueComplex)
        assertEquals(expectedValue, actualValueSimple)
    }
    @Test
    fun minSplit_correctAmounts_returnsCorrectAnswer() {
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
        val actualValuesComplex = testAmounts.map { complexMinSplit(it) }
        val actualValuesSimple = testAmounts.map { simpleMinSplit(it) }
        assertEquals(expectedValues, actualValuesComplex)
        assertEquals(expectedValues, actualValuesSimple)
    }
}