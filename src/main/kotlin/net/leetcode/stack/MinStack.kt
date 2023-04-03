package net.leetcode.stack

//https://leetcode.com/problems/min-stack/

class MinStack {

    private val stack = ArrayDeque<Int>()

    private val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addFirst(`val`)
        if (minStack.isEmpty()) {
            minStack.addFirst(`val`)
        } else {
            val min = minOf(minStack.first(), stack.first())
            minStack.addFirst(min)
        }
    }

    fun pop() {
        stack.removeFirst()
        minStack.removeFirst()
    }

    fun top(): Int {
        return stack.first()
    }

    fun getMin(): Int {
        return minStack.first()
    }

}
