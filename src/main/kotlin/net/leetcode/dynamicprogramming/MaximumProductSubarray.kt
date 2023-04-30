package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/maximum-product-subarray/

fun maxProduct(nums: IntArray): Int {
    var result = nums[0]
    var prevMin = nums[0]
    var prevMax = nums[0]

    for (i in 1..nums.lastIndex) {
        val minI = prevMin * nums[i]
        val maxI = prevMax * nums[i]
        prevMin = minOf(nums[i], minI, maxI)
        prevMax = maxOf(nums[i], minI, maxI)
        result = maxOf(result, prevMax)
    }
    return result
}
