package com.interview.coding.exercises

class ExOneToTen {

    /**
     * Given a sorted array, remove the duplicates in place such that each element appear only once and
     * return the new length.
     */
    fun removeDuplicatesFromSortedArray(input: Array<Int?>?): List<Int> {
        return when {
            input.isNullOrEmpty() -> listOf()
            else -> input.filterNotNull().distinct()
        }
    }
}