package net.leetcode.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ThreeSumTest {

    @ParameterizedTest
    @MethodSource
    fun testThreeSum(nums: IntArray, expected: List<List<Int>>) {
        Assertions.assertEquals(expected, threeSum(nums))
    }

    fun testThreeSum(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(-1, 0, 1, 2, -1, -4), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))),
            Arguments.of(intArrayOf(0, 1, 1), emptyList<List<List<Int>>>()),
            Arguments.of(intArrayOf(0, 0, 0), listOf(listOf(0, 0, 0))),
            Arguments.of(intArrayOf(-1, 0, 1, 0), listOf(listOf(-1, 0, 1))),
        )
    }

}
