package net.leetcode.slidingwindow

//https://leetcode.com/problems/find-all-anagrams-in-a-string/

fun findAnagrams(s: String, p: String): List<Int> {
    val result = mutableListOf<Int>()
    val count = IntArray(128)
    var required = p.length

    for (c in p) {
        count[c - 'a']++
    }

    var left = 0
    for ((right, c) in s.withIndex()) {
        if (--count[c - 'a'] >= 0) {
            required--
        }
        while (required == 0) {
            if (right - left + 1 == p.length) {
                result.add(left)
            }
            if (++count[s[left++] - 'a'] > 0) {
                required++
            }
        }
    }

    return result
}
