package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class ContainsDuplicateTest {

    @TestFactory
    fun testContainsDuplicate(): List<DynamicTest> {
        return listOf(
            intArrayOf(1, 2, 3, 1) to true,
            intArrayOf(1, 2, 3, 4) to false,
            intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2) to true,
        )
            .map { (input, expected) ->
                DynamicTest.dynamicTest("When input array ${input.contentToString()} then $expected") {
                    assertEquals(expected, containsDuplicate(input))
                }
            }
    }

}
