package net.leetcode.arraysandhashing

//https://leetcode.com/problems/spiral-matrix/

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()
    val m = matrix.size
    val n = matrix[0].size

    var top = 0
    var bottom = m - 1
    var left = 0
    var right = n - 1

    while (top <= bottom && left <= right) {
        for (i in left..right) {
            result.add(matrix[top][i])
        }
        top++

        for (i in top..bottom) {
            result.add(matrix[i][right])
        }
        right--

        if (top <= bottom) {
            for (i in right downTo left) {
                result.add(matrix[bottom][i])
            }
            bottom--
        }

        if (left <= right) {
            for (i in bottom downTo top) {
                result.add(matrix[i][left])
            }
            left++
        }
    }

    return result
}
