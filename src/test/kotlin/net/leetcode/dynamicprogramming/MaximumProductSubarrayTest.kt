package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaximumProductSubarrayTest {

    @ParameterizedTest
    @MethodSource
    fun testMaxProduct(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, maxProduct(nums))
    }

    fun testMaxProduct(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 3, -2, 4), 6),
            Arguments.of(intArrayOf(-2, 0, -1), 0),
        )
    }

}
