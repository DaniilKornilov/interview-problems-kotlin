package net.leetcode.twopointers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TrappingRainWaterTest {

    @ParameterizedTest
    @MethodSource
    fun testTrap(height: IntArray, expected: Int) {
        Assertions.assertEquals(expected, trap(height))
    }

    fun testTrap(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1), 6),
            Arguments.of(intArrayOf(4, 2, 0, 3, 2, 5), 9),
        )
    }

}
