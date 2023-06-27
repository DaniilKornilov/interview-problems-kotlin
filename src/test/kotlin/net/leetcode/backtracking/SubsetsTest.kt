package net.leetcode.backtracking

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SubsetsTest {

    @ParameterizedTest
    @MethodSource
    fun testSubsets(nums: IntArray, expected: List<List<Int>>) {
        assertThat(expected).hasSameElementsAs(subsets(nums))
    }

    fun testSubsets(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(
                intArrayOf(1, 2, 3),
                listOf(
                    listOf(),
                    listOf(1),
                    listOf(2),
                    listOf(1, 2),
                    listOf(3),
                    listOf(1, 3),
                    listOf(2, 3),
                    listOf(1, 2, 3),
                )
            ),
            Arguments.of(intArrayOf(0), listOf(listOf(), listOf(0))),
        )
    }

}
