package net.leetcode.arraysandhashing

//https://leetcode.com/problems/top-k-frequent-elements/

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val numToCount = HashMap<Int, Int>()
    for (num in nums) {
        numToCount[num] = numToCount.getOrDefault(num, 0) + 1
    }
    val frequencyArray = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
    for (entry in numToCount) {
        frequencyArray[entry.value].add(entry.key)
    }
    val result = mutableListOf<Int>()
    for (i in frequencyArray.indices.reversed()) {
        for (num in frequencyArray[i]) {
            result.add(num)
            if (result.size == k) {
                return result.toIntArray()
            }
        }
    }
    throw IllegalArgumentException("Can't find k frequent elements!")
}
