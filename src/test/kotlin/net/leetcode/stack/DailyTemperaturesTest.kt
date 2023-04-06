package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DailyTemperaturesTest {

    @ParameterizedTest
    @MethodSource
    fun testDailyTemperatures(temperatures: IntArray, expected: IntArray) {
        Assertions.assertArrayEquals(expected, dailyTemperatures(temperatures))
    }

    fun testDailyTemperatures(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73), intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)),
            Arguments.of(intArrayOf(30, 40, 50, 60), intArrayOf(1, 1, 1, 0)),
            Arguments.of(intArrayOf(30, 60, 90), intArrayOf(1, 1, 0)),
        )
    }

}
