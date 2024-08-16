package com.leetcode.merge.twoSortedArrays;

public class MergeTwoSortedArrays extends AbstractParent {

    @Override
    public int[] merge(int[] arr1, int[] arr2) {
        int finalLength = arr1.length + arr2.length;
        int[] result = new int[finalLength];
        for (int i = 0, j = 0, k = 0; k < finalLength; k++) {
            if (i == arr1.length) {
                result[k] = arr2[j];
                j++;
                continue;
            }
            if (j == arr2.length) {
                result[k] = arr1[i];
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
        }
        return result;
    }
}
