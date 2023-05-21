package net.leetcode.linkedlist

//https://leetcode.com/problems/add-two-numbers/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy = ListNode(-1)
    var currentResult = dummy
    var currentL1 = l1
    var currentL2 = l2

    var carry = 0
    while (currentL1 != null || currentL2 != null) {
        val v1 = currentL1?.`val` ?: 0
        val v2 = currentL2?.`val` ?: 0
        val currentSum = v1 + v2 + carry
        carry = currentSum / 10
        currentResult.next = ListNode(currentSum % 10)

        currentResult = currentResult.next!!
        currentL1 = currentL1?.next
        currentL2 = currentL2?.next
    }

    if (carry != 0) {
        currentResult.next = ListNode(carry)
    }
    return dummy.next
}
