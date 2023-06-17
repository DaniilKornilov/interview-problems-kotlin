package net.leetcode.arraysandhashing

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SpiralMatrixTest {

    @ParameterizedTest
    @MethodSource
    fun testSpiralOrder(matrix: Array<IntArray>, expected: List<Int>) {
        Assertions.assertEquals(expected, spiralOrder(matrix))
    }

    fun testSpiralOrder(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(
                arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)),
                listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
            ),
            Arguments.of(
                arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12)),
                listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
            ),
        )
    }

}
