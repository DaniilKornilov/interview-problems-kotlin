package net.leetcode.arraysandhashing

//https://leetcode.com/problems/longest-consecutive-sequence/

fun longestConsecutive(nums: IntArray): Int {
    val numSet = nums.toSet()
    var result = 0
    for (num in nums) {
        if (!numSet.contains(num - 1)) {
            var length = 1
            while (numSet.contains(num + length)) {
                length++
            }
            result = maxOf(result, length)
        }
    }
    return result
}
