package net.leetcode.dynamicprogramming

//https://leetcode.com/problems/maximum-product-subarray/

fun maxProduct(nums: IntArray): Int {
    val maxProduct = IntArray(nums.size)
    val minProduct = IntArray(nums.size)
    maxProduct[0] = nums[0]
    minProduct[0] = nums[0]
    var result = nums[0]

    for (i in 1..nums.lastIndex) {
        val currentMaxProduct = nums[i] * maxProduct[i - 1]
        val currentMinProduct = nums[i] * minProduct[i - 1]
        maxProduct[i] = maxOf(currentMaxProduct, currentMinProduct, nums[i])
        minProduct[i] = minOf(currentMaxProduct, currentMinProduct, nums[i])
        result = maxOf(result, maxProduct[i])
    }

    return result
}
