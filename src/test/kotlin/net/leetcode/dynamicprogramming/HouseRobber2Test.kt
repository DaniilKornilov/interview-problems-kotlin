package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HouseRobber2Test {

    @ParameterizedTest
    @MethodSource
    fun testRob2(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, rob2(nums))
    }

    fun testRob2(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 3, 2), 3),
            Arguments.of(intArrayOf(1, 2, 3, 1), 4),
            Arguments.of(intArrayOf(1, 2, 3), 3),
        )
    }

}
