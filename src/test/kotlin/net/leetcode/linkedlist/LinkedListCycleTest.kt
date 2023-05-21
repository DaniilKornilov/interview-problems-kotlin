package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LinkedListCycleTest {

    private lateinit var head: ListNode

    @BeforeEach
    fun setUp() {
        head = ListNode(3)
        val node1 = ListNode(2)
        val node2 = ListNode(0)
        val node3 = ListNode(-4)

        head.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node1
    }

    @Test
    fun testHasCycle() {
        val maxTwinSum = hasCycle(head)
        Assertions.assertEquals(true, maxTwinSum)
    }

}
