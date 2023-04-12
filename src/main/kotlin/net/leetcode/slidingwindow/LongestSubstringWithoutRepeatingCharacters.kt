package net.leetcode.slidingwindow

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

fun lengthOfLongestSubstring(s: String): Int {
    val substring = mutableSetOf<Char>()
    var left = 0
    var result = 0

    s.indices.forEach { right ->
        while (s[right] in substring) {
            substring.remove(s[left])
            left++
        }
        substring.add(s[right])
        result = maxOf(result, substring.size)
    }

    return result
}
