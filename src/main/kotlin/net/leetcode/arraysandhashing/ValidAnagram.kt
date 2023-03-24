package net.leetcode.arraysandhashing

//https://leetcode.com/problems/valid-anagram/

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    return getCharToCountMap(s) == getCharToCountMap(t)
}

private fun getCharToCountMap(s: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (char in s) {
        val count = map[char] ?: 0
        map[char] = count + 1
    }
    return map
}
