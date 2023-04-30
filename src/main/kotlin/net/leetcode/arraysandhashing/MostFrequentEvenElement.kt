package net.leetcode.arraysandhashing

//https://leetcode.com/problems/most-frequent-even-element/

fun mostFrequentEven(nums: IntArray): Int {
    return nums.filter { it % 2 == 0 }
        .groupingBy { it }
        .eachCount()
        .toSortedMap()
        .maxByOrNull { it.value }
        ?.key ?: -1
}
