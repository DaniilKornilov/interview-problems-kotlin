package net.leetcode.arraysandhashing

//https://leetcode.com/problems/fizz-buzz/

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        val current = StringBuilder()
        if (i % 3 == 0) {
            current.append("Fizz")
        }
        if (i % 5 == 0) {
            current.append("Buzz")
        }
        if (current.isEmpty()) {
            current.append(i.toString())
        }
        result.add(current.toString())
    }
    return result
}
