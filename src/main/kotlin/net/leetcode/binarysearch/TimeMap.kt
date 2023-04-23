package net.leetcode.binarysearch

//https://leetcode.com/problems/time-based-key-value-store/

class TimeMap {

    private val map = mutableMapOf<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.computeIfAbsent(key) { mutableListOf() }.add(Pair(value, timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        var result = ""
        val values = map.getOrDefault(key, arrayListOf())
        var left = 0
        var right = values.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2
            if (values[mid].second <= timestamp) {
                result = values[mid].first
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }

}
