package net.leetcode.twopointers

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        if (sum < target) {
            left++
        } else if (sum > target) {
            right--
        } else {
            return intArrayOf(left + 1, right + 1)
        }
    }
    throw IllegalArgumentException("Nums elements can't be summed to target!")
}
