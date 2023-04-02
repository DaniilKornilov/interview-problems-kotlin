package net.leetcode.stack

//https://leetcode.com/problems/valid-parentheses/

fun isValid(s: String): Boolean {
    if (s.length % 2 == 1) {
        return false
    }

    val stack = ArrayDeque<Char>()
    val closeToOpenBracket = hashMapOf(
        '}' to '{',
        ')' to '(',
        ']' to '[',
    )

    for (bracket in s) {
        if (!closeToOpenBracket.containsKey(bracket)) {
            stack.addFirst(bracket)
        } else if (stack.isEmpty() || stack.removeFirst() != closeToOpenBracket[bracket]) {
            return false
        }
    }

    return stack.isEmpty()
}
