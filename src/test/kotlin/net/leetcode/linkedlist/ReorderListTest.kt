package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ReorderListTest {

    private lateinit var head: ListNode

    @BeforeEach
    fun setUp() {
        head = ListNode(1)
        val node1 = ListNode(2)
        val node2 = ListNode(3)
        val node3 = ListNode(4)
        val node4 = ListNode(5)

        head.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4
    }

    @Test
    fun testReverseLinkedList() {
        reorderList(head)
        Assertions.assertEquals("1 -> 5 -> 2 -> 4 -> 3", head.toString())
    }

}
