package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JumpGame2Test {

    @ParameterizedTest
    @MethodSource
    fun testJump(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, jump(nums))
    }

    fun testJump(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 3, 1, 1, 4), 2),
            Arguments.of(intArrayOf(2, 3, 0, 1, 4), 2),
        )
    }

}
