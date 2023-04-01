package net.leetcode.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContainerWithMostWaterTest {

    @ParameterizedTest
    @MethodSource
    fun testMaxArea(height: IntArray, expected: Int) {
        Assertions.assertEquals(expected, maxArea(height))
    }

    fun testMaxArea(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7), 49),
            Arguments.of(intArrayOf(1, 1), 1),
        )
    }

}
