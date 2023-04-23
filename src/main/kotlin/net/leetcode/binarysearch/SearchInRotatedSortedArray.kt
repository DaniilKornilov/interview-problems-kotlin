package net.leetcode.binarysearch

//https://leetcode.com/problems/search-in-rotated-sorted-array/

fun searchRotated(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2
        if (target == nums[mid]) {
            return mid
        }

        if (nums[left] <= nums[mid]) {
            if (target > nums[mid] || target < nums[left]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        } else {
            if (target < nums[mid] || target > nums[right]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
    }

    return -1
}
