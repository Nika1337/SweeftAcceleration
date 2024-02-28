package tasks

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach
import tasks.minsplit.SimpleMinSplit
import kotlin.test.assertEquals

class SimpleMinSplitTest {

    private lateinit var simpleMinSplit: SimpleMinSplit
    @BeforeEach
    fun initialize() {
        simpleMinSplit = SimpleMinSplit()
    }
    @Test
    fun splitMinSplit_amountZero_returnsZero() {
        val testAmount = 0
        val expectedValue = 0
        val actualValue = simpleMinSplit(testAmount)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun splitMinSplit_correctAmounts_returnsCorrectAnswer() {
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
        val actualValues = List(testAmounts.size) { index -> simpleMinSplit(testAmounts[index]) }
        assertEquals(expectedValues, actualValues)
    }
}