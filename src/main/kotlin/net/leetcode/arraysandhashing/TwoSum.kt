package net.leetcode.arraysandhashing

//https://leetcode.com/problems/two-sum/

fun twoSum(nums: IntArray, target: Int): IntArray {
    val addendToIndex = mutableMapOf<Int, Int>()
    for ((i, num) in nums.withIndex()) {
        val addend = target - num
        if (addendToIndex.containsKey(addend)) {
            return intArrayOf(addendToIndex.getValue(addend), i)
        }
        addendToIndex[num] = i
    }
    throw IllegalArgumentException("Nums elements can't be summed to target!")
}
