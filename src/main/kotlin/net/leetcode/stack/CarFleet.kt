package net.leetcode.stack

//https://leetcode.com/problems/car-fleet/

fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
    val positionToSpeed = position.zip(speed)
        .sortedByDescending { (position, _) -> position }

    val stack = ArrayDeque<Float>()
    for ((pos, s) in positionToSpeed) {
        stack.addFirst((target - pos).toFloat() / s)
        if (stack.size > 1) {
            val first = stack.removeFirst()
            val second = stack.first()
            stack.addFirst(first)
            if (first <= second) {
                stack.removeFirst()
            }
        }
    }
    return stack.size
}
