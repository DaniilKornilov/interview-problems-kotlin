package net.leetcode.stack

//https://leetcode.com/problems/generate-parentheses/

fun generateParenthesis(n: Int): List<String> {
    val stack = ArrayDeque<Char>()
    val result = mutableListOf<String>()

    fun backtrack(openedCount: Int, closedCount: Int) {
        if (openedCount == n && closedCount == n) {
            result.add(stack.joinToString(""))
        }
        if (openedCount < n) {
            stack.addLast('(')
            backtrack(openedCount + 1, closedCount)
            stack.removeLast()
        }
        if (closedCount < n && closedCount < openedCount) {
            stack.addLast(')')
            backtrack(openedCount, closedCount + 1)
            stack.removeLast()
        }
    }

    backtrack(0, 0)
    return result
}
