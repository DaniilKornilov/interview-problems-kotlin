package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MakeArrayZeroBySubtractingEqualAmountsTest {

    @ParameterizedTest
    @MethodSource
    fun testMinimumOperations(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, minimumOperations(nums))
    }

    fun testMinimumOperations(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 5, 0, 3, 5), 3),
            Arguments.of(intArrayOf(0), 0),
        )
    }

}
