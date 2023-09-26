package net.leetcode.binarysearch

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val n1 = nums1.size
    val n2 = nums2.size
    if (n1 > n2) {
        return findMedianSortedArrays(nums2, nums1)
    }

    val n = n1 + n2
    val half = (n + 1) / 2

    var left = 0
    var right = n1

    while (left <= right) {
        val mid1 = (left + right) / 2
        val mid2 = half - mid1

        val left1 = if (mid1 > 0) nums1[mid1 - 1] else Int.MIN_VALUE
        val left2 = if (mid2 > 0) nums2[mid2 - 1] else Int.MIN_VALUE
        val right1 = if (mid1 < n1) nums1[mid1] else Int.MAX_VALUE
        val right2 = if (mid2 < n2) nums2[mid2] else Int.MAX_VALUE

        if (left1 <= right2 && left2 <= right1) {
            return if (n % 2 == 1) {
                maxOf(left1, left2).toDouble()
            } else {
                (maxOf(left1, left2) + minOf(right1, right2)) / 2.0
            }
        } else if (left1 > right2) {
            right = mid1 - 1
        } else {
            left = mid1 + 1
        }
    }
    return 0.0
}
