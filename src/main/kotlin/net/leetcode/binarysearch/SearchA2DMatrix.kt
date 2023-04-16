package net.leetcode.binarysearch

//https://leetcode.com/problems/search-a-2d-matrix/

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var row = matrix.size
    val col = matrix.first().size
    var top = 0
    var bot = row - 1

    while (top <= bot) {
        row = (top + bot) / 2
        if (target > matrix[row][col - 1]) {
            top = row + 1
        } else if (target < matrix[row][0]) {
            bot = row - 1
        } else {
            break
        }
    }

    if (top > bot) {
        return false
    }

    row = (top + bot) / 2
    var left = 0
    var right = col - 1
    while (left <= right) {
        val middle = (left + right) / 2
        if (target > matrix[row][middle]) {
            left = middle + 1
        } else if (target < matrix[row][middle]) {
            right = middle - 1
        } else {
            return true
        }
    }

    return false
}
