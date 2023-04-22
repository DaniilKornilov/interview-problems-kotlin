package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {

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
        val reversedHead = reverseList(head)
        assertEquals("5 -> 4 -> 3 -> 2 -> 1", reversedHead.toString())
    }

}
