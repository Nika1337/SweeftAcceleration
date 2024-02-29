package tasks.singlenumber

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class DefaultSingleNumberTest {

    private lateinit var defaultSingleNumber: DefaultSingleNumber
    @BeforeEach
    fun initialize() {
        defaultSingleNumber = DefaultSingleNumber()
    }
    @Test
    fun singleNumber_invokeOnEmptyArray_returnMinusOne() {
        val testArray = intArrayOf()
        val expected = -1
        val actual = defaultSingleNumber(testArray)
        assertEquals(expected, actual)
    }
    @Test
    fun singleNumber_invokeOnCorrectArray_returnsOddOneOut() {
        val testArray = intArrayOf(2,2,1,3,3)
        val expected = 1
        val actual = defaultSingleNumber(testArray)
        assertEquals(expected, actual)
    }

}