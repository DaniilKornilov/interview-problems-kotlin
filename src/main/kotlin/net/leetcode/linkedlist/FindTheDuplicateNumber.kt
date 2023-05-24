package net.leetcode.linkedlist

//https://leetcode.com/problems/find-the-duplicate-number/

fun findDuplicate(nums: IntArray): Int {
    var slow = 0
    var fast = 0
    do {
        slow = nums[slow]
        fast = nums[nums[fast]]
    } while (slow != fast)

    var slow2 = 0
    do {
        slow2 = nums[slow2]
        slow = nums[slow]
    } while (slow2 != slow)

    return slow
}
