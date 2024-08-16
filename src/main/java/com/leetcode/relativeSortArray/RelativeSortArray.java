package com.leetcode.relativeSortArray;

import java.util.Arrays;

public class RelativeSortArray extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 65.06%
     * of users with Java
     * Memory
     * 41.52
     * MB
     * Beats
     * 96.54%
     * of users with Java
     * @param arr1
     * @param arr2
     * @return
     */
    @Override
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //brute force
        // j signifies position of arr1 we are at
        // count the frequency of each number in arr1
        // iterate over arr2 and find out frequency of each in arr1 from frequency array
        // put a pointer at start of arr1
        // while frequency is not 0 (still numbers present) and number at current pointer is not equal to
        // current number in arr1
        int[] freqArr = new int[1001];

        for (int i = 0; i < arr1.length; i++) {
            freqArr[arr1[i]]++;
        }

        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (freqArr[arr2[i]] != 0) {
                if (arr1[j] != arr2[i]) {
                    // find next index of arr2[i] and swap
                    int k = j + 1;
                    for (; k < arr1.length; k++) {
                        if (arr1[k] == arr2[i]) {
                            break;
                        }
                    }
                    arr1[k] = arr1[j];
                    arr1[j] = arr2[i];
                }
                j++;
                freqArr[arr2[i]]--;
            }
        }
        // remaining numbers in increasing order
        Arrays.sort(arr1, j, arr1.length);
        return arr1;
    }
}
