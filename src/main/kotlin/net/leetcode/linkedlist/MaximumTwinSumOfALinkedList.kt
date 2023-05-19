package net.leetcode.linkedlist

//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

fun pairSum(head: ListNode?): Int {
    val stack = ArrayDeque<Int>()

    var current = head
    while (current != null) {
        stack.addFirst(current.`val`)
        current = current.next
    }

    var result = Int.MIN_VALUE
    current = head
    val pairCount = stack.size / 2
    while (current != null && stack.size >= pairCount) {
        val currentPairSum = stack.removeFirst() + current.`val`
        result = maxOf(result, currentPairSum)
        current = current.next
    }

    return result
}
