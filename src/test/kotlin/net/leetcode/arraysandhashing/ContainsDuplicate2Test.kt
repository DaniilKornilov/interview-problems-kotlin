package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContainsDuplicate2Test {

    @ParameterizedTest
    @MethodSource
    fun testContainsNearbyDuplicate(nums: IntArray, k: Int, expected: Boolean) {
        Assertions.assertEquals(expected, containsNearbyDuplicate(nums, k))
    }

    fun testContainsNearbyDuplicate(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 1), 3, true),
            Arguments.of(intArrayOf(1, 0, 1, 1), 1, true),
            Arguments.of(intArrayOf(1, 2, 3, 1, 2, 3), 2, false),
        )
    }

}
