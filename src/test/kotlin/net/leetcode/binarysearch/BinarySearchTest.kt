package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinarySearchTest {

    @ParameterizedTest
    @MethodSource
    fun testSearch(nums: IntArray, target: Int, expected: Int) {
        Assertions.assertEquals(expected, search(nums, target))
    }

    fun testSearch(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(-1, 0, 3, 5, 9, 12), 9, 4),
            Arguments.of(intArrayOf(-1, 0, 3, 5, 9, 12), 2, -1),
        )
    }

}
