package com.leetcode.duplicateZeros;

import java.util.Arrays;

public class DuplicateZeros extends AbstractParent {

    @Override
    public void duplicateZeros(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int i = 0, j = 0, zeroCount;
        while( i < arr.length) {
            // count the number of zeros and move the pointer
            zeroCount = 0;
            while (j < arr.length && temp[j] == 0) {
               j++;
               zeroCount += 2;
            }
            if (zeroCount > 0) {
                zeroCount = Math.min( i + zeroCount, arr.length);
                while (i < zeroCount) {
                    arr[i] = 0;
                    i++;
                }
            }
            if (i < arr.length) {
                arr[i] = temp[j];
                i++;
                j++;
            }
         }
    }
}
