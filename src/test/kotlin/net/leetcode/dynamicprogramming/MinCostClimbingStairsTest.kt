package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinCostClimbingStairsTest {

    @ParameterizedTest
    @MethodSource
    fun testMinCostClimbingStairs(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, minCostClimbingStairs(nums))
    }

    fun testMinCostClimbingStairs(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(10, 15, 20), 15),
            Arguments.of(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1), 6),
        )
    }

}
