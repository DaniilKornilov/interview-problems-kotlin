package net.leetcode.twopointers

//https://leetcode.com/problems/3sum/

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for ((i, num) in nums.withIndex()) {
        if (i > 0 && nums[i - 1] == num) {
            continue
        }

        var left = i + 1
        var right = nums.lastIndex
        while (left < right) {
            val threeSum = num + nums[left] + nums[right]
            if (threeSum > 0) {
                right--
            } else if (threeSum < 0) {
                left++
            } else {
                result.add(listOf(num, nums[left], nums[right]))
                left++
                while (left < right && nums[left] == nums[left - 1]) {
                    left++
                }
            }
        }
    }

    return result
}
