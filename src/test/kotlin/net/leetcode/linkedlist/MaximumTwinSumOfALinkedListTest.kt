package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MaximumTwinSumOfALinkedListTest {

    private lateinit var head: ListNode

    @BeforeEach
    fun setUp() {
        head = ListNode(5)
        val node1 = ListNode(4)
        val node2 = ListNode(2)
        val node3 = ListNode(1)

        head.next = node1
        node1.next = node2
        node2.next = node3
    }

    @Test
    fun testPairSum() {
        val maxTwinSum = pairSum(head)
        Assertions.assertEquals(6, maxTwinSum)
    }

}
