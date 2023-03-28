package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LongestConsecutiveSequenceTest {

    @ParameterizedTest
    @MethodSource
    fun testProductExceptSelf(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, longestConsecutive(nums))
    }

    fun testProductExceptSelf(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(100, 4, 200, 1, 3, 2), 4),
            Arguments.of(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1), 9),
        )
    }

}
