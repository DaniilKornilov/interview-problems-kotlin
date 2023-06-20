package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/climbing-stairs/

fun climbStairs(n: Int): Int {
    if (n == 1) {
        return 1
    }

    val result = IntArray(n)
    result[0] = 1
    result[1] = 2

    for (i in 2..result.lastIndex) {
        result[i] = result[i - 1] + result[i - 2]
    }

    return result[result.lastIndex]
}
