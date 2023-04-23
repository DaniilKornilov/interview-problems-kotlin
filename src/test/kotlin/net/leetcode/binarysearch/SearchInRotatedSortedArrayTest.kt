package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchInRotatedSortedArrayTest {

    @ParameterizedTest
    @MethodSource
    fun testSearchRotated(nums: IntArray, target: Int, expected: Int) {
        Assertions.assertEquals(expected, searchRotated(nums, target))
    }

    fun testSearchRotated(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0, 4),
            Arguments.of(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3, -1),
            Arguments.of(intArrayOf(1), 0, -1),
        )
    }

}
