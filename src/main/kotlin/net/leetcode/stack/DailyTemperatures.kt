package net.leetcode.stack

//https://leetcode.com/problems/daily-temperatures/

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val stack = ArrayDeque<Pair<Int, Int>>()

    for ((index, temperature) in temperatures.withIndex()) {
        while (!stack.isEmpty() && temperature > stack.first().first) {
            val (_, stackIndex) = stack.removeFirst()
            result[stackIndex] = index - stackIndex
        }
        stack.addFirst(temperature to index)
    }

    return result
}
