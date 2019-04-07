package com.interview.coding.exercises

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.fail
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExOneToTenTest {

    private val subject = ExOneToTen()

    @DisplayName("Testing Ex1: RemoveDuplicatesFromSortedArray")
    @ParameterizedTest(name = "Case {index} : Remove duplicates according to {0} value(s) in the array")
    @CsvSource("null,0", "2,2", "2_With_1_Null,1", "moreThan_2,5", "moreThan_2_WithNulls,4")
    fun testEx1(case: String, expectedSize: Int){
        val input: Array<Int?>? = when (case) {
            "null" -> null
            "2" -> arrayOf(1,2)
            "2_With_1_Null" -> arrayOf(1,null)
            "moreThan_2" -> arrayOf(1,2,3,4,5,1,2,3)
            "moreThan_2_WithNulls" -> arrayOf(1,null,3,4,null,1,2,3,null)
            else -> fail("Should not come here!")
        }

        val expectedResult = when (case) {
            "null" -> listOf()
            "2" -> listOf(1,2)
            "2_With_1_Null" -> listOf(1)
            "moreThan_2" -> listOf(1,2,3,4,5)
            "moreThan_2_WithNulls" -> listOf(1,3,4,2)
            else -> fail("Should not come here!")
        }

        val result = subject.removeDuplicatesFromSortedArray(input)
        Assertions.assertEquals(expectedResult, result)
        Assertions.assertEquals(expectedSize, result.size)
    }
}