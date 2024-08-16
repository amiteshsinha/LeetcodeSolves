package com.leetcode.medianSortedArray;

import org.junit.jupiter.api.Test;

public class MedianSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int finalLength = nums1.length + nums2.length;
        int mid = finalLength/2 + 1;
        int [] finalArray = new int [mid];
        for (int i = 0, j = 0, k = 0; k < mid; k++) {
            // for the remaining elements
            if (j == nums2.length) {
                finalArray[k] = nums1[i];
                i++;
                continue;
            }
            if (i == nums1.length) {
                finalArray[k] = nums2[j];
                j++;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                finalArray[k] = nums1[i];
                i++;
            } else {
                finalArray[k] = nums2[j];
                j++;
            }

        }
        mid--;
        if (finalLength%2 == 1) {
            return finalArray[mid];
        } else {
            return (double)(finalArray[mid] + finalArray[mid - 1])/2;
        }
    }

    @Test
    public void should_return_correct_median1() {
        assert (findMedianSortedArrays(new int[]{1,3}, new int[]{2}) == 2);
    }

    @Test
    public void should_return_correct_median2() {
        assert (findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}) == 2.5);
    }

    @Test
    public void should_return_correct_median6() {
        assert (findMedianSortedArrays(new int[]{1,2,3,5,8,11}, new int[]{3,4}) == 3.5);
    }

    @Test
    public void should_return_correct_median3() {
        assert (findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}) == 0.0);
    }

    @Test
    public void should_return_correct_median4() {
        assert (findMedianSortedArrays(new int[]{1}, new int[]{}) == 1.0);
    }

    @Test
    public void should_return_correct_median5() {
        assert (findMedianSortedArrays(new int[]{}, new int[]{2}) == 2.0);
    }
}
