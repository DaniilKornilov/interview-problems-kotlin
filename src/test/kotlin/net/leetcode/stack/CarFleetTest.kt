package net.leetcode.stack

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CarFleetTest {

    @ParameterizedTest
    @MethodSource
    fun testCarFleet(target: Int, position: IntArray, speed: IntArray, expected: Int) {
        Assertions.assertEquals(expected, carFleet(target, position, speed))
    }

    fun testCarFleet(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(0, intArrayOf(3), intArrayOf(3), 1),
            Arguments.of(12, intArrayOf(10, 8, 0, 5, 3), intArrayOf(2, 4, 1, 1, 3), 3),
            Arguments.of(100, intArrayOf(0, 2, 4), intArrayOf(4, 2, 1), 1),
        )
    }

}
