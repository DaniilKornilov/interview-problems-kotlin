package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MedianOfTwoSortedArraysKtTest {

    @ParameterizedTest
    @MethodSource
    fun testFindMedianSortedArrays(nums1: IntArray, nums2: IntArray, expected: Double) {
        Assertions.assertEquals(expected, findMedianSortedArrays(nums1, nums2))
    }

    fun testFindMedianSortedArrays(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 3), intArrayOf(2), 2.00000),
            Arguments.of(intArrayOf(1, 2), intArrayOf(3, 4), 2.50000),
        )
    }

}
