package com.leetcode.maxNoOfIntsFromRange;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 45.58
 * MB
 * Beats
 * 83.64%
 * This file was created on 06/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class MaxNoOfIntegersFromRangeIter2 extends AbstractParent {

    /**
     * Greedy approach - iterate from 1-n and figure out which min no can be added which is not banned
     * Improvement2 - instead of finding size of boolean array use the constraint limits
     * @param banned
     * @param n
     * @param maxSum
     * @return
     */
    @Override
    public int maxCount(int[] banned, int n, int maxSum) {
        int retVal = 0, currSum = 0;
        boolean[] bannedArr = new boolean[10001];
        for (int i : banned) {
            bannedArr[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (i + currSum > maxSum) {
                break;
            }
            if (!bannedArr[i]) {
                retVal++;
                currSum += i;
            }
        }
        return retVal;
    }

}
