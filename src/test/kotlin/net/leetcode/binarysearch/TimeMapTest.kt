package net.leetcode.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeMapTest {

    private val timeMap: TimeMap = TimeMap()

    @Test
    fun testTimeMap() {
        timeMap.set("foo", "bar", 1)
        assertEquals("bar", timeMap.get("foo", 1))
        assertEquals("bar", timeMap.get("foo", 3))
        timeMap.set("foo", "bar2", 4)
        assertEquals("bar2", timeMap.get("foo", 4))
        assertEquals("bar2", timeMap.get("foo", 5))
    }

}
