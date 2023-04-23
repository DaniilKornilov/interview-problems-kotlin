package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindMinimumInRotatedSortedArrayTest {

    @ParameterizedTest
    @MethodSource
    fun testFindMin(nums: IntArray, expected: Int) {
        Assertions.assertEquals(expected, findMin(nums))
    }

    fun testFindMin(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(3, 4, 5, 1, 2), 1),
            Arguments.of(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0),
            Arguments.of(intArrayOf(11, 13, 15, 17), 11),
            Arguments.of(intArrayOf(3, 1, 2), 1),
        )
    }

}
