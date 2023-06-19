package net.leetcode.backtracking

//https://leetcode.com/problems/permutations/

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    fun backtrack(current: MutableList<Int>) {
        if (current.size == nums.size) {
            result.add(current.toList())
            return
        }
        for (num in nums) {
            if (!current.contains(num)) {
                current.add(num)
                backtrack(current)
                current.removeAt(current.lastIndex)
            }
        }
    }
    backtrack(mutableListOf())
    return result
}

fun main() {
    permute(intArrayOf(1, 2, 3))
}
