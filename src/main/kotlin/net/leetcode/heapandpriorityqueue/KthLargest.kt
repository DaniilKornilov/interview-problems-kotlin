package net.leetcode.heapandpriorityqueue

import java.util.PriorityQueue

//https://leetcode.com/problems/kth-largest-element-in-a-stream/

class KthLargest(k: Int, nums: IntArray) {
    private val minHeap = PriorityQueue<Int> { a, b -> a - b }
    private var k = Integer.MIN_VALUE

    init {
        this.k = k
        for (num in nums) {
            minHeap.add(num)
        }
        while (minHeap.size > k) {
            minHeap.poll()
        }
    }

    fun add(`val`: Int): Int {
        minHeap.add(`val`)
        if (minHeap.size > k) {
            minHeap.poll()
        }
        return minHeap.peek()
    }

}
