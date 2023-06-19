package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/house-robber/

fun rob(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }

    val result = IntArray(nums.size)
    result[0] = nums[0]
    result[1] = maxOf(nums[0], nums[1])

    for (i in 2..nums.lastIndex) {
        result[i] = maxOf(nums[i] + result[i - 2], result[i - 1])
    }

    return result[result.lastIndex]
}
