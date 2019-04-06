package com.interview.coding.exercises

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExOneToTenTest {

    private val subject = ExOneToTen()

    @DisplayName("Testing Ex1: RemoveDuplicatesFromSortedArray")
    @ParameterizedTest(name = "Case {index} : Remove duplicates according to {0} value(s) in the array")
    @CsvSource("null", "2", "moreThan_2")
    fun testEx1(case: String){
        when (case) {
            "null" -> {
                val result = subject.removeDuplicatesFromSortedArray(null)
                Assertions.assertEquals(listOf<Int>(), result)
                Assertions.assertEquals(0, result.size)
            }
            "2" -> {
                val result = subject.removeDuplicatesFromSortedArray(arrayOf(1,2))
                Assertions.assertEquals(listOf(1,2), result)
                Assertions.assertEquals(2, result.size)
            }
            "moreThan_2" -> {
                val result = subject.removeDuplicatesFromSortedArray(arrayOf(1,2,3,4,5,1,2,3))
                Assertions.assertEquals(listOf(1,2,3,4,5), result)
                Assertions.assertEquals(5, result.size)
            }
        }

    }
}