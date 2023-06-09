package net.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinStackTest {

    private val minStack: MinStack = MinStack()

    @Test
    fun testMinStack() {
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assertEquals(-3, minStack.getMin())
        minStack.pop()
        assertEquals(0, minStack.top())
        assertEquals(-2, minStack.getMin())
    }
}
