package net.leetcode.backtracking

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PermutationsTest {

    @ParameterizedTest
    @MethodSource
    fun testPermute(nums: IntArray, expected: List<List<Int>>) {
        Assertions.assertEquals(expected, permute(nums))
    }

    fun testPermute(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(
                intArrayOf(1, 2, 3),
                listOf(
                    listOf(1, 2, 3),
                    listOf(1, 3, 2),
                    listOf(2, 1, 3),
                    listOf(2, 3, 1),
                    listOf(3, 1, 2),
                    listOf(3, 2, 1),
                )
            ),
            Arguments.of(intArrayOf(0, 1), listOf(listOf(0, 1), listOf(1, 0))),
            Arguments.of(intArrayOf(1), listOf(listOf(1)))
        )
    }

}
