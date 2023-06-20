package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClimbingStairsTest {

    @ParameterizedTest
    @MethodSource
    fun testClimbStairs(n: Int, expected: Int) {
        Assertions.assertEquals(expected, climbStairs(n))
    }

    fun testClimbStairs(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(2, 2),
            Arguments.of(3, 3),
            Arguments.of(4, 5),
        )
    }

}
