package net.leetcode.arraysandhashing

//https://leetcode.com/problems/valid-anagram/

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    return getCharToCountMap(s) == getCharToCountMap(t)
}

private fun getCharToCountMap(string: String): Map<Char, Int> {
    val charToCount = mutableMapOf<Char, Int>()
    for (char in string) {
        val count = charToCount[char] ?: 0
        charToCount[char] = count + 1
    }
    return charToCount
}
