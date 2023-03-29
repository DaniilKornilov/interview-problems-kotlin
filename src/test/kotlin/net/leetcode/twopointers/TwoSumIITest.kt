package net.leetcode.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TwoSumIITest {

    @ParameterizedTest
    @MethodSource
    fun testTwoSum(nums: IntArray, target: Int, expected: IntArray) {
        Assertions.assertArrayEquals(expected, twoSum(nums, target))
    }

    fun testTwoSum(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 7, 11, 15), 9, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(2, 3, 4), 6, intArrayOf(1, 3)),
            Arguments.of(intArrayOf(-1, 0), -1, intArrayOf(1, 2)),
        )
    }

}
