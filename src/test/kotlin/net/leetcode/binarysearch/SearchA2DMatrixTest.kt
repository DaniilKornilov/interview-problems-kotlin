package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchA2DMatrixTest {

    @ParameterizedTest
    @MethodSource
    fun testSearchMatrix(matrix: Array<IntArray>, target: Int, expected: Boolean) {
        Assertions.assertEquals(expected, searchMatrix(matrix, target))
    }

    fun testSearchMatrix(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(
                arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
                3,
                true
            ),
            Arguments.of(
                arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
                13,
                false
            ),
        )
    }

}
