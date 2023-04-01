package net.leetcode.twopointers

import kotlin.math.max

//https://leetcode.com/problems/trapping-rain-water/

fun trap(height: IntArray): Int {
    var result = 0

    var left = 0
    var currentLeftMax = 0

    var right = height.lastIndex
    var currentRightMax = 0

    while (left < right) {
        if (height[left] <= height[right]) {
            currentLeftMax = max(currentLeftMax, height[left])
            left++
            val leftResult = currentLeftMax - height[left]
            if (leftResult > 0) {
                result += leftResult
            }
        } else {
            currentRightMax = max(currentRightMax, height[right])
            right--
            val rightResult = currentRightMax - height[right]
            if (rightResult > 0) {
                result += rightResult
            }
        }
    }

    return result
}
