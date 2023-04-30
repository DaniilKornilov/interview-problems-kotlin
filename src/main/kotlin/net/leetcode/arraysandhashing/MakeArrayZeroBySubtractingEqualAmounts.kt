package net.leetcode.arraysandhashing

//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/

fun minimumOperations(nums: IntArray): Int {
    val uniqueNums = nums.toSet()
    return uniqueNums.size - uniqueNums.count { it == 0 }
}
