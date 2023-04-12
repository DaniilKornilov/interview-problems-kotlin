package net.leetcode.slidingwindow

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

fun maxProfit(prices: IntArray): Int {
    var result = 0
    var lowestPrice = prices[0]

    for (price in prices) {
        if (price < lowestPrice) {
            lowestPrice = price
        }
        result = maxOf(result, price - lowestPrice)
    }

    return result
}
