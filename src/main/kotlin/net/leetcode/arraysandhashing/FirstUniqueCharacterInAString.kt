package net.leetcode.arraysandhashing

//https://leetcode.com/problems/first-unique-character-in-a-string/

fun firstUniqChar(s: String): Int {
    val charToCount = mutableMapOf<Char, Int>()

    for (c in s) {
        val count = charToCount.getOrDefault(c, 0)
        charToCount[c] = count.inc()
    }

    for ((i, c) in s.withIndex()) {
        if (charToCount.getOrDefault(c, -1) == 1) {
            return i
        }
    }

    return -1
}
