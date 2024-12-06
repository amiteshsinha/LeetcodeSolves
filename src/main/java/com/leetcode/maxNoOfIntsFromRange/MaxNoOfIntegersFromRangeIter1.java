package com.leetcode.maxNoOfIntsFromRange;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * This file was created on 06/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class MaxNoOfIntegersFromRangeIter1 extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 96.20%
     *
     * Memory
     * 45.84
     * MB
     * Beats
     * 46.36%
     * Greedy approach - iterate from 1-n and figure out which min no can be added which is not banned
     * Improvement - instead of set use boolean array - and turns out that's all the fix that you need
     * @param banned
     * @param n
     * @param maxSum
     * @return
     */
    @Override
    public int maxCount(int[] banned, int n, int maxSum) {
        int retVal = 0, currSum = 0, maxBannedVal = n;
        for (int i : banned) {
            maxBannedVal = Math.max(i , maxBannedVal);
        }
        boolean[] bannedArr = new boolean[maxBannedVal + 1];
        for (int i : banned) {
            bannedArr[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!bannedArr[i] && i + currSum <= maxSum) {
                retVal++;
                currSum += i;
            }
        }
        return retVal;
    }

}
