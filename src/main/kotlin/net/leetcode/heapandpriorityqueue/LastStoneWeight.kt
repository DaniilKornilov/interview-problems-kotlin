package net.leetcode.heapandpriorityqueue

import java.util.PriorityQueue

//https://leetcode.com/problems/last-stone-weight/

fun lastStoneWeight(stones: IntArray): Int {
    val heap = PriorityQueue<Int> { a, b -> b - a }

    for (stone in stones) {
        heap.add(stone)
    }

    while (!heap.isEmpty()) {
        if (heap.size == 1) {
            return heap.poll()
        }

        val first = heap.poll()
        val second = heap.poll()

        if (first != second) {
            heap.add(first - second)
        }
    }

    return 0
}
