package net.leetcode.binarysearch

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

fun findMin(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }

    var left = 0
    var right = nums.lastIndex
    var result = Int.MAX_VALUE

    while (left < right) {
        val mid = (left + right) / 2
        if (nums[mid] < nums[right]) {
            right = mid
        } else {
            left = mid + 1
        }
        result = nums[left]
    }

    return result
}
