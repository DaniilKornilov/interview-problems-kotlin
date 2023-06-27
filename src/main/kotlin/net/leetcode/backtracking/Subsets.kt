package net.leetcode.backtracking

//https://leetcode.com/problems/subsets/

fun subsets(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val subset = mutableListOf<Int>()
    fun backtrack(index: Int) {
        if (index > nums.lastIndex) {
            result.add(subset.toList())
            return
        }
        subset.add(nums[index])
        backtrack(index + 1)

        subset.removeAt(subset.lastIndex)
        backtrack(index + 1)
    }
    backtrack(0)
    return result
}
