package net.leetcode.arraysandhashing

import kotlin.math.abs

//https://leetcode.com/problems/contains-duplicate-ii/description/

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val numToIndex = mutableMapOf<Int, Int>()

    for ((i, num) in nums.withIndex()) {
        if (numToIndex.containsKey(num)) {
            val j = numToIndex.getValue(num)
            if (abs(i - j) <= k) {
                return true
            }
        }
        numToIndex[num] = i
    }

    return false
}
