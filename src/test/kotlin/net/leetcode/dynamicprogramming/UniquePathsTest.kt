package net.leetcode.dynamicprogramming

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UniquePathsTest {

    @ParameterizedTest
    @MethodSource
    fun testUniquePaths(m: Int, n: Int, expected: Int) {
        Assertions.assertEquals(expected, uniquePaths(m, n))
    }

    fun testUniquePaths(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(3, 2, 3),
            Arguments.of(3, 7, 28),
        )
    }

}
