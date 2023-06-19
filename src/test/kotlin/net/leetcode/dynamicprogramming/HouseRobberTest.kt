package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HouseRobberTest {

    @ParameterizedTest
    @MethodSource
    fun testRob(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, rob(nums))
    }

    fun testRob(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 1), 4),
            Arguments.of(intArrayOf(2, 7, 9, 3, 1), 12),
            Arguments.of(intArrayOf(0), 0),
            Arguments.of(intArrayOf(2, 1, 1, 2), 4),
            Arguments.of(intArrayOf(8, 1, 1, 1, 1, 3), 12),
        )
    }

}
