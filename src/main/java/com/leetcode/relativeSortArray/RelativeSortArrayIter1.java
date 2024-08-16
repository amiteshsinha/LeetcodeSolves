package com.leetcode.relativeSortArray;

public class RelativeSortArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.71
     * MB
     * Beats
     * 84.05%
     * of users with Java
     * @param arr1
     * @param arr2
     * @return
     */
    @Override
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freqArr = new int[1001];
        int[] retArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            freqArr[arr1[i]]++;
        }

        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (freqArr[arr2[i]] != 0) {
                retArr[j] = arr2[i];
                j++;
                freqArr[arr2[i]]--;
            }
        }
        // remaining numbers in increasing order
        for (int i = 0; i < 1001; i++) {
            if (freqArr[i] != 0) {
                while (freqArr[i] != 0) {
                    retArr[j] = i;
                    j++;
                    freqArr[i]--;
                }
            }
        }
        return retArr;
    }
}
