package net.leetcode.linkedlist

//https://leetcode.com/problems/linked-list-cycle/

fun hasCycle(head: ListNode?): Boolean {
    if (head == null) {
        return false
    }

    var slow = head
    var fast = head.next?.next
    while (fast != null) {
        if (slow == fast) {
            return true
        }
        slow = slow?.next
        fast = fast.next?.next
    }

    return false
}
