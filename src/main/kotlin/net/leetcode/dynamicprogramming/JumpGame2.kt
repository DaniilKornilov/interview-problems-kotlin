package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/jump-game-ii/

fun jump(nums: IntArray): Int {
    val result = IntArray(nums.size)
    result.fill(Int.MAX_VALUE)
    result[0] = 0
    for (i in 1..nums.lastIndex) {
        for (j in 0 until i) {
            if (j + nums[j] >= i) {
                result[i] = minOf(result[i], result[j] + 1)
            }
        }
    }
    return result[result.lastIndex]
}
