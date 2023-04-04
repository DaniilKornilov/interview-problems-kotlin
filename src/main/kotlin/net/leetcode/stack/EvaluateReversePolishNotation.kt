package net.leetcode.stack

//https://leetcode.com/problems/evaluate-reverse-polish-notation/

fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()
    for (token in tokens) {
        when (token) {
            "+" -> stack.addFirst(stack.removeFirst() + stack.removeFirst())
            "-" -> {
                val a = stack.removeFirst()
                val b = stack.removeFirst()
                stack.addFirst(b - a)
            }

            "*" -> stack.addFirst(stack.removeFirst() * stack.removeFirst())
            "/" -> {
                val a = stack.removeFirst()
                val b = stack.removeFirst()
                stack.addFirst(b / a)
            }

            else -> stack.addFirst(token.toInt())
        }
    }
    return stack.removeFirst()
}
