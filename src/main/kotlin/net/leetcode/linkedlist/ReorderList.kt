package net.leetcode.linkedlist

//https://leetcode.com/problems/reorder-list/

fun reorderList(head: ListNode?) {
    if (head?.next == null) {
        return
    }

    var slow = head
    var fast = head.next

    while (fast?.next != null && slow != null) {
        fast = fast.next!!.next
        slow = slow.next
    }

    var reversed = reverseList(slow!!.next)
    slow.next = null
    var curr = head

    while (curr != null && reversed != null) {
        val next = curr.next
        val revNext = reversed.next
        curr.next = reversed
        reversed.next = next
        curr = next
        reversed = revNext
    }
}
