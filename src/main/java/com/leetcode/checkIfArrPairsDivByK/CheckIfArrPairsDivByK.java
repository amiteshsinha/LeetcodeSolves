package com.leetcode.checkIfArrPairsDivByK;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 99.37%
 *
 * Memory
 * 56.01
 * MB
 * Beats
 * 91.08%
 * This file was created on 04/10/24 / Friday
 */
public class CheckIfArrPairsDivByK extends AbstractParent {

    @Override
    public boolean canArrange(int[] arr, int k) {
        int[] kRemainder = new int[k];
        int t, max;
        for (int i : arr) {
//            if (i < 0) {
//                t = Math.abs(i);
//                max = t / k;
//                i = (max + 1)*k + i;
//            }
            kRemainder[(i%k + k)%k]++;
        }
        if (kRemainder[0]%2 != 0) {
            return false;
        }
        for (int i = 1, j = k - 1; i < j;i++,j--) {
            if (kRemainder[i] != kRemainder[j]) {
                return false;
            }
        }
        return true;
    }

    private int getPosRemainderVal(int i, int k) {
        int t = Math.abs(i);
        int max = t / k;
        return (max + 1)*k + i;
    }
}
