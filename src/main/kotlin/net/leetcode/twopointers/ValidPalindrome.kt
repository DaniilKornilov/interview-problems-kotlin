package net.leetcode.twopointers

//https://leetcode.com/problems/valid-palindrome/

fun isPalindrome(s: String): Boolean {
    val cleanString = s.filter { it.isLetterOrDigit() }
    if (cleanString.isEmpty()) {
        return true
    }
    var left = 0
    var right = cleanString.lastIndex
    while (left < right) {
        if (!cleanString[left++].equals(cleanString[right--], ignoreCase = true)) {
            return false
        }
    }
    return true
}
