package tasks.addbinarystrings

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddBinaryStringsTest {
    private lateinit var defaultAddBinaryStrings: DefaultAddBinaryStrings

    @BeforeEach
    fun initialize() {
        defaultAddBinaryStrings = DefaultAddBinaryStrings()
    }

    @Test
    fun addBinaryStrings_invokeOnEmptyStrings_returnsEmptyString() {
        val testA = ""
        val testB = ""
        val expectedValue = ""
        val actualValue = defaultAddBinaryStrings.invoke(testA, testB)
        assertEquals(expectedValue, actualValue)
    }
    @Test
    fun addBinaryString_invokeOnOneEmptyOneNormalString_returnsNormalString() {
        val testA = ""
        val testB = "10001"
        val expectedValue = "10001"
        val actualValue = defaultAddBinaryStrings.invoke(testA, testB)
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun addBinaryString_invoke_returnsCorrectResult() {
        val testPairs = listOf(
            "1010" to "1011",
            "11" to "1",
            "1000" to "1101"
        )
        val expectedValues = listOf(
            "10101",
            "100",
            "10101"
        )
        val actualValues = testPairs.map { defaultAddBinaryStrings(it.first, it.second) }
        assertEquals(expectedValues, actualValues)
    }
}