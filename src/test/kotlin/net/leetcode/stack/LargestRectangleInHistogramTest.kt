package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LargestRectangleInHistogramTest {

    @ParameterizedTest
    @MethodSource
    fun testLargestRectangleArea(heights: IntArray, expected: Int) {
        Assertions.assertEquals(expected, largestRectangleArea(heights))
    }

    fun testLargestRectangleArea(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 1, 5, 6, 2, 3), 10),
            Arguments.of(intArrayOf(2, 4), 4),
        )
    }

}
