package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/min-cost-climbing-stairs/

fun minCostClimbingStairs(cost: IntArray): Int {
    if (cost.size == 2) {
        return minOf(cost[0], cost[1])
    }

    val result = IntArray(cost.size)
    result[2] = minOf(cost[0], cost[1])

    for (i in 3..cost.lastIndex) {
        result[i] = minOf(cost[i - 1] + result[i - 1], cost[i - 2] + result[i - 2])
    }

    return minOf(
        result[result.lastIndex] + cost[cost.lastIndex],
        result[result.lastIndex - 1] + cost[cost.lastIndex - 1]
    )
}
