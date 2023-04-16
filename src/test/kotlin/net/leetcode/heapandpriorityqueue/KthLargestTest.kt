package net.leetcode.heapandpriorityqueue

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthLargestTest {

    private val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))

    @Test
    fun testKthLargest() {
        assertEquals(4, kthLargest.add(3))
        assertEquals(5, kthLargest.add(5))
        assertEquals(5, kthLargest.add(10))
        assertEquals(8, kthLargest.add(9))
        assertEquals(8, kthLargest.add(4))
    }

}
