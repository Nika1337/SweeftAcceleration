package tasks.constanttimedeletedatastructure

import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DataStructureTest {
    private lateinit var constantTimeDeleteDataStructure: ConstantTimeDeleteDataStructure<Int>

    @BeforeEach
    fun initialize() {
        constantTimeDeleteDataStructure = ConstantTimeDeleteDataStructure()
    }

    @Test
    fun dataStructure_getAllInitially_returnsEmptyList() {
        val expectedResult = emptyList<Int>()
        val actualResult = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun dataStructure_insertElement_InsertsElement() {
        val testElement = 6
        constantTimeDeleteDataStructure.insert(testElement)
        val expectedResult = listOf(testElement)
        val actualResult = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun dataStructure_insertAlreadyInsertedElement_returnsFalse() {
        val testElement = 10
        constantTimeDeleteDataStructure.insert(testElement)
        val expectedResult = false
        val actualResult = constantTimeDeleteDataStructure.insert(testElement)
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun dataStructure_deleteElement_deletesElement() {
        val testElement1 = 6
        val testElement2 = 3
        constantTimeDeleteDataStructure.insert(testElement1)
        constantTimeDeleteDataStructure.insert(testElement2)
        constantTimeDeleteDataStructure.delete(testElement1)
        val expectedResult = listOf(testElement2)
        val actualResult = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult, actualResult)
    }


    @Test
    fun dataStructure_deleteNonExistentElement_returnsFalse() {
        val testElement = 3
        val expectedResult = false
        val actualResult = constantTimeDeleteDataStructure.delete(testElement)
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun dataStructure_testCase1_returnCorrectAnswers() {
        assertTrue(constantTimeDeleteDataStructure.insert(0))
        val expectedResult1 = listOf(0)
        val actualResult1 = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult1, actualResult1)

        assertTrue(constantTimeDeleteDataStructure.insert(1))
        val expectedResult2 = listOf(0, 1).sorted()
        val actualResult2 = constantTimeDeleteDataStructure.getAll().sorted()
        assertEquals(expectedResult2, actualResult2)

        assertTrue(constantTimeDeleteDataStructure.delete(0))
        val expectedResult3 = listOf(1)
        val actualResult3 = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult3, actualResult3)

        assertTrue(constantTimeDeleteDataStructure.insert(2))
        val expectedResult4 = listOf(1, 2).sorted()
        val actualResult4 = constantTimeDeleteDataStructure.getAll().sorted()
        assertEquals(expectedResult4, actualResult4)


        assertTrue(constantTimeDeleteDataStructure.delete(1))
        val expectedResult5 = listOf(2)
        val actualResult5 = constantTimeDeleteDataStructure.getAll()
        assertEquals(expectedResult5, actualResult5)

    }
}