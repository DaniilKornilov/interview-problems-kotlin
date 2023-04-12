package net.leetcode.slidingwindow

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource
    fun testMaxProfit(prices: IntArray, expected: Int) {
        Assertions.assertEquals(expected, maxProfit(prices))
    }

    fun testMaxProfit(): Stream<Arguments> {
        return Stream.of(
            Arguments.of(intArrayOf(7, 1, 5, 3, 6, 4), 5),
            Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0),
        )
    }

}
