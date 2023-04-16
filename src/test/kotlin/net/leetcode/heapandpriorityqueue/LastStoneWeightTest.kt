package net.leetcode.heapandpriorityqueue

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LastStoneWeightTest {

    @ParameterizedTest
    @MethodSource
    fun testLastStoneWeight(stones: IntArray, expected: Int) {
        Assertions.assertEquals(expected, lastStoneWeight(stones))
    }

    fun testLastStoneWeight(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(2, 7, 4, 1, 8, 1), 1),
            Arguments.of(intArrayOf(1), 1),
        )
    }

}
