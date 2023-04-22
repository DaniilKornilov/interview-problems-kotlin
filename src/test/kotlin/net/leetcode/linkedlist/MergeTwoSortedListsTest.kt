package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MergeTwoSortedListsTest {

    private lateinit var head1: ListNode

    private lateinit var head2: ListNode

    @BeforeEach
    fun setUp() {
        head1 = ListNode(1)
        val node11 = ListNode(2)
        val node21 = ListNode(4)

        head1.next = node11
        node11.next = node21

        head2 = ListNode(1)
        val node12 = ListNode(3)
        val node22 = ListNode(4)

        head2.next = node12
        node12.next = node22
    }

    @Test
    fun testReverseLinkedList() {
        val mergedListsHead = mergeTwoLists(head1, head2)
        Assertions.assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4", mergedListsHead.toString())
    }

}
