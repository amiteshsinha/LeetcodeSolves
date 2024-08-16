package com.leetcode.getEqualSubstringWithinBudget;

public class GetEqualSubstringWithinBudget extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 99.07%
     * of users with Java
     * Memory
     * 43.11
     * MB
     * Beats
     * 40.06%
     * of users with Java
     * @param s
     * @param t
     * @param maxCost
     * @return
     */
    @Override
    public int equalSubstring(String s, String t, int maxCost) {
        int length = s.length(), retval = 0, i = 0, j = 0, maxSoFar = 0;
        int[] diffArr = new int[length];
        for (; i < length; i++) {
            diffArr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        i = 0;
        while (j < length) {
            while (maxSoFar <= maxCost && j < length) {
                maxSoFar += diffArr[j];
                j++;
            }
            // sum is greater than maxCost
            retval = Math.max(retval, j - i - 1);
            while (maxSoFar > maxCost && i < j) {
                maxSoFar -= diffArr[i];
                i++;
            }
            retval = Math.max(retval, j - i);
        }
        return retval;
    }
}
