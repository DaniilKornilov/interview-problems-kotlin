package net.leetcode.linkedlist

//https://leetcode.com/problems/reverse-linked-list/

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }

    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}
