package net.leetcode.arraysandhashing

//https://leetcode.com/problems/group-anagrams/

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<String, MutableList<String>>()
    for (str in strs) {
        val chars = IntArray(26)
        for (char in str) {
            chars[char - 'a']++
        }
        result.getOrPut(chars.contentToString()) { mutableListOf() }.add(str)
    }
    return result.entries.map { it.value }
}
