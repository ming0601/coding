package com.interview.coding.exercises

class ExOneToTen {

    /**
     * Ex1: Given a sorted array, remove the duplicates in place such that each element appear only once and
     * return the new length.
     */
    fun removeDuplicatesFromSortedArray(input: Array<Int?>?): List<Int> {
        return when {
            input.isNullOrEmpty() -> listOf()
            else -> input.filterNotNull().distinct()
        }
    }

    /**
     * Ex2: Follow up for "Remove Duplicates": What if duplicates are allowed at most twice
     */
    fun allowDuplicatesAtMostTwice(input: Array<Int?>?): List<Int> {
        return when {
            input.isNullOrEmpty() -> emptyList()
            input.size < 3 -> input.filterNotNull().sorted()
            else -> {
                val filteredList = input.filterNotNull().sorted().toMutableList()
                val result = mutableListOf<Int>()
                var i = 0
                var j = 1
                while (j < filteredList.size) {
                    if (filteredList[j] == filteredList[i]) {
                        when {
                            i == 0 -> {
                                result.add(filteredList[i])
                                result.add(filteredList[j])
                                i++
                                j++
                            }

                            filteredList[i] == filteredList[i-1] -> j++

                            else -> {
                                i++
                                filteredList[i] = filteredList[j]
                                result.add(filteredList[i])
                                j++
                            }
                        }
                    } else {
                        i++
                        filteredList[i] = filteredList[j]
                        result.add(filteredList[i])
                        j++
                    }
                }
                return result
            }
        }
    }
}