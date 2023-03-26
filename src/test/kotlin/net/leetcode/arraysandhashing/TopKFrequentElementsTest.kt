package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TopKFrequentElementsTest {

    @ParameterizedTest
    @MethodSource
    fun testTopKFrequent(nums: IntArray, k: Int, expected: IntArray) {
        Assertions.assertArrayEquals(expected, topKFrequent(nums, k))
    }

    fun testTopKFrequent(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 2, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(1), 1, intArrayOf(1)),
        )
    }

}
