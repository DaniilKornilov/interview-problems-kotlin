package net.leetcode.slidingwindow

//https://leetcode.com/problems/longest-repeating-character-replacement/

fun characterReplacement(s: String, k: Int): Int {
    var result = 0
    var maxCount = 0
    val count = IntArray(128)

    var left = 0
    for ((right, c) in s.withIndex()) {
        val currentCount = ++count[c - 'A']
        maxCount = maxOf(maxCount, currentCount)
        while (maxCount + k < right - left + 1) {
            count[s[left] - 'A']--
            left++
        }
        result = maxOf(result, right - left + 1)
    }

    return result
}
