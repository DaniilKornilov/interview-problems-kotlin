package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheDuplicateNumberTest {

    @ParameterizedTest
    @MethodSource
    fun testFindTheDuplicateNumber(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, findDuplicate(nums))
    }

    fun testFindTheDuplicateNumber(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 3, 4, 2, 2), 2),
            Arguments.of(intArrayOf(3, 1, 3, 4, 2), 3),
        )
    }

}
