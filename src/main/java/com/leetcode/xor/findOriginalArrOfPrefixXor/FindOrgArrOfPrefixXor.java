package com.leetcode.xor.findOriginalArrOfPrefixXor;

public class FindOrgArrOfPrefixXor extends AbstractParent {

/**
 * if we do a sum and find a prefix array of sum it would be like
 * int sum = 0;
 * for (int i = 0 ; i < arr.length; i++) {
 *    sum = arr[i] + sum;
 *     perf[i] = sum;
 * }
 * if we have to get the ORIGINAL arr back we will need to start from the last val
 * for (int i = perf.length - 1; i > 0; i--) {
 *     arr[i] = perf[i] - perf[i - 1];
 * }
 * Similarly - if we have to solve this problem - we have to put it in terms of xor - hence we just replace - by ^
 */

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 65.06
     * MB
     * Beats
     * 5.54%
     * of users with Java
     * @param pref
     * @return
     */
    @Override
    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; --i) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 90.24%
     * of users with Java
     * Memory
     * 56.44
     * MB
     * Beats
     * 90.57%
     * of users with Java
     * @param pref
     * @return
     */
    public int[] findArray1(int[] pref) {
        int[] newOrgArr = new int[pref.length];
        for (int i = pref.length - 1; i > 0; i--) {
            newOrgArr[i] = pref[i]^pref[i - 1];
        }
        newOrgArr[0] = pref[0];
        return newOrgArr;
    }
}
