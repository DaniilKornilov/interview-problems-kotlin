package net.leetcode.arraysandhashing

//https://leetcode.com/problems/contains-duplicate/

fun containsDuplicate(nums: IntArray): Boolean {
    val uniqueElements: MutableSet<Int> = mutableSetOf()
    for (num in nums) {
        if (uniqueElements.contains(num)) {
            return true
        }
        uniqueElements.add(num)
    }
    return false
}
