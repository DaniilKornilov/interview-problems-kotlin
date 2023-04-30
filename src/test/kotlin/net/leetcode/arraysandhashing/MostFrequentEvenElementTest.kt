package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MostFrequentEvenElementTest {

    @ParameterizedTest
    @MethodSource
    fun testMostFrequentEven(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, mostFrequentEven(nums))
    }

    fun testMostFrequentEven(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(0, 1, 2, 2, 4, 4, 1), 2),
            Arguments.of(intArrayOf(4, 4, 4, 9, 2, 4), 4),
            Arguments.of(intArrayOf(29, 47, 21, 41, 13, 37, 25, 7), -1),
            Arguments.of(intArrayOf(0, 0, 0, 0), 0),
        )
    }

}
