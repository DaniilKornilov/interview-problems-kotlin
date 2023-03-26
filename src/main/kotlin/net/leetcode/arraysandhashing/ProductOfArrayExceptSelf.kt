package net.leetcode.arraysandhashing

//https://leetcode.com/problems/product-of-array-except-self/

fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size) { 1 }
    var prefix = 1
    for ((i, num) in nums.withIndex()) {
        result[i] = prefix
        prefix *= num
    }
    var postfix = 1
    for (i in nums.indices.reversed()) {
        result[i] *= postfix
        postfix *= nums[i]
    }

    return result
}
