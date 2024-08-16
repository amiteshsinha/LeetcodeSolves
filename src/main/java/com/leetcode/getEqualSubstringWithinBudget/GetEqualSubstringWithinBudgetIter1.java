package com.leetcode.getEqualSubstringWithinBudget;

public class GetEqualSubstringWithinBudgetIter1 extends AbstractParent {

    /**
     * Runtime
     * 5
     * ms
     * Beats
     * 97.52%
     * of users with Java
     * Memory
     * 43.47
     * MB
     * Beats
     * 17.55%
     * of users with Java
     * @param s
     * @param t
     * @param maxCost
     * @return
     */
    @Override
    public int equalSubstring(String s, String t, int maxCost) {
        int length = s.length(), retval = 0;
        int[] diffArr = new int[length];
        for (int i = 0; i < length; i++) {
            diffArr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int i = 0, j = 0, maxSoFar = 0;
        while (i < length && j < length) {
            maxSoFar += diffArr[j++];
            if (maxSoFar <= maxCost) {
                retval = Math.max(retval, j - i);
            } else {
                while (maxSoFar > maxCost) {
                    maxSoFar -= diffArr[i++];
                }
            }
        }
        return retval;
    }
}
