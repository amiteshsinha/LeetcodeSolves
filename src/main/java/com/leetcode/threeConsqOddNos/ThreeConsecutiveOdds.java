package com.leetcode.threeConsqOddNos;

public class ThreeConsecutiveOdds extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.84
     * MB
     * Beats
     * 86.80%
     * @param arr
     * @return
     */
    @Override
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean a, b,c;
        int j = 3;
        a = isOdd(arr[0]);
        b = isOdd(arr[1]);
        c = isOdd(arr[2]);
        if (a && b && c) {
            return true;
        }
        while (j < arr.length) {
            a = b;
            b = c;
            c = isOdd(arr[j]);
            if (a && b && c) {
                return true;
            }
            j++;
        }
        return false;
    }

    boolean isOdd(int num) {
        return num%2 != 0;
    }
}
