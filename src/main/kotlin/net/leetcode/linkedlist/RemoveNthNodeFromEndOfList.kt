package net.leetcode.linkedlist

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if (head?.next == null) {
        return null
    }

    var counter = 0
    var current = head
    while (current != null) {
        counter++
        current = current.next
    }

    current = head
    var currentCounter = 1
    while (currentCounter < counter - n) {
        currentCounter++
        current = current?.next
    }

    return if (current == head && n == counter) {
        current.next
    } else {
        current?.next = current?.next?.next
        head
    }

}
