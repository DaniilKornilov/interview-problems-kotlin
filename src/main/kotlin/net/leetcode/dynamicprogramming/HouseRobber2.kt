package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/house-robber-ii/

fun rob2(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }

    val resultHouse1 = IntArray(nums.size)
    resultHouse1[0] = nums[0]
    resultHouse1[1] = maxOf(nums[0], nums[1])

    val resultHouse2 = IntArray(nums.size)
    resultHouse2[1] = nums[1]

    for (i in 2..nums.lastIndex) {
        resultHouse1[i] = maxOf(nums[i] + resultHouse1[i - 2], resultHouse1[i - 1])
        resultHouse2[i] = maxOf(nums[i] + resultHouse2[i - 2], resultHouse2[i - 1])
    }

    return maxOf(resultHouse1[resultHouse1.lastIndex - 1], resultHouse2[resultHouse2.lastIndex])
}
