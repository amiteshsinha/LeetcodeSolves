package com.leetcode.maxNoOfIntsFromRange;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Runtime
 * 66
 * ms
 * Beats
 * 11.41%
 *
 * Memory
 * 46.36
 * MB
 * Beats
 * 6.82%
 * This file was created on 06/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class MaxNoOfIntegersFromRange extends AbstractParent {

    @Override
    public int maxCount(int[] banned, int n, int maxSum) {
        int retVal = 0, currSum = 0;
        Set<Integer> bannedSet = Arrays.stream(banned).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i) && i + currSum <= maxSum) {
                retVal++;
                currSum += i;
            }
        }
        return retVal;
    }

}
