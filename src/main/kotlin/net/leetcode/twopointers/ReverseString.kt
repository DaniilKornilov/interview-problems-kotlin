package net.leetcode.twopointers

//https://leetcode.com/problems/reverse-string/

fun reverseString(s: CharArray) {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        s[left] = s[right].also { s[right] = s[left] }
        left++
        right--
    }
}
