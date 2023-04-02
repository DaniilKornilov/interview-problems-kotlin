package net.leetcode.stack

//https://leetcode.com/problems/valid-parentheses/

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val closeToOpenBracket = hashMapOf(
        '}' to '{',
        ')' to '(',
        ']' to '[',
    )

    for (bracket in s) {
        if (!closeToOpenBracket.keys.contains(bracket)) {
            stack.addFirst(bracket)
        } else {
            if (stack.isEmpty() || stack.first() != closeToOpenBracket.getValue(bracket)) {
                return false
            }
            stack.removeFirst()
        }
    }

    return stack.isEmpty()
}
