package tasks

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import tasks.singlenumber.SingleNumber

class SingleNumberTest {

    private lateinit var singleNumber: SingleNumber
    @BeforeEach
    fun initialize() {
        singleNumber = SingleNumber()
    }
    @Test
    fun singleNumber_invokeOnEmptyArray_returnMinusOne() {
        val testArray = intArrayOf()
        val expected = -1
        val actual = singleNumber(testArray)
        assertEquals(expected, actual)
    }
    @Test
    fun singleNumber_invokeOnCorrectArray_returnsOddOneOut() {
        val testArray = intArrayOf(2,2,1,3,3)
        val expected = 1
        val actual = singleNumber(testArray)
        assertEquals(expected, actual)
    }

}