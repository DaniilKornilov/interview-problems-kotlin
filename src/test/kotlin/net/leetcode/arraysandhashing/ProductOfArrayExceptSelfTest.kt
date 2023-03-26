package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ProductOfArrayExceptSelfTest {

    @ParameterizedTest
    @MethodSource
    fun testProductExceptSelf(nums: IntArray, expected: IntArray) {
        Assertions.assertArrayEquals(expected, productExceptSelf(nums))
    }

    fun testProductExceptSelf(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 4), intArrayOf(24, 12, 8, 6)),
            Arguments.of(intArrayOf(-1, 1, 0, -3, 3), intArrayOf(0, 0, 9, 0, 0)),
        )
    }

}
