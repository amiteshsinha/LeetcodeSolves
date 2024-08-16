package com.leetcode.mergeSortedArray;

public class MergeSortedArrays extends AbstractParent {
    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 42.42
     * MB
     * Beats
     * 6.73%
     * of users with Java
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int j = m - 1, k = n - 1;
        for (int i = m + n - 1; i >= 0; --i) {
            if ((k >= 0 && j >= 0 && nums2[k] >= nums1[j]) || k>= 0 && j < 0)  {
                nums1[i] = nums2[k];
                k--;
            } else {
                nums1[i] = nums1[j];
                nums1[j] = 0;
                j--;
            }
            if (k < 0) {
                break;
            }
        }
    }
}
