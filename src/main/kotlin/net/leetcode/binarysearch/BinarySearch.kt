package net.leetcode.binarysearch

//https://leetcode.com/problems/binary-search/

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2
        if (nums[mid] < target) {
            left = mid + 1
        } else if (nums[mid] > target) {
            right = mid - 1
        } else if (nums[mid] == target) {
            return mid
        }
    }

    return -1
}
