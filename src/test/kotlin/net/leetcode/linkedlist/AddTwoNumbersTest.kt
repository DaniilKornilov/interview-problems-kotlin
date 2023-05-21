package net.leetcode.linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    private lateinit var head1: ListNode

    private lateinit var head2: ListNode

    @BeforeEach
    fun setUp() {
        head1 = ListNode(2)
        val node11 = ListNode(4)
        val node21 = ListNode(3)

        head1.next = node11
        node11.next = node21

        head2 = ListNode(5)
        val node12 = ListNode(6)
        val node22 = ListNode(4)

        head2.next = node12
        node12.next = node22
    }

    @Test
    fun testMergeTwoLists() {
        val sum = addTwoNumbers(head1, head2)
        Assertions.assertEquals("7 -> 0 -> 8", sum.toString())
    }

}
