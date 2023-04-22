package net.leetcode.stack

//https://leetcode.com/problems/largest-rectangle-in-histogram/

fun largestRectangleArea(heights: IntArray): Int {
    val stack = ArrayDeque<Pair<Int, Int>>()
    var maxArea = 0

    for ((i, h) in heights.withIndex()) {
        var start = i
        while (!stack.isEmpty() && stack.first().second > h) {
            val (index, height) = stack.removeFirst()
            maxArea = maxOf(maxArea, height * (i - index))
            start = index
        }
        stack.addFirst(Pair(start, h))
    }

    for ((i, h) in stack) {
        maxArea = maxOf(maxArea, h * (heights.size - i))
    }

    return maxArea
}
