package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KokoEatingBananasTest {

    @ParameterizedTest
    @MethodSource
    fun testMinEatingSpeed(piles: IntArray, h: Int, expected: Int) {
        Assertions.assertEquals(expected, minEatingSpeed(piles, h))
    }

    fun testMinEatingSpeed(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(3, 6, 7, 11), 8, 4),
            Arguments.of(intArrayOf(30, 11, 23, 4, 20), 5, 30),
            Arguments.of(intArrayOf(30, 11, 23, 4, 20), 6, 23),
        )
    }

}
