package com.leetcode.longestSquareStreakInArray;

import java.util.Arrays;

/**
 * Runtime
 * 43
 * ms
 * Beats
 * 75.00%
 *
 * Memory
 * 60.56
 * MB
 * Beats
 * 54.17%
 * This file was created on 28/10/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class LongestSquareStreakInArrayIter1 extends AbstractParent {

    @Override
    public int longestSquareStreak(int[] nums) {
        int max = 100000, result = 0;
        boolean[] isPresent = new boolean[max + 1];
        boolean[] visited = new boolean[max + 1];
        for (int n : nums) {
            isPresent[n] = true;
        }
        for (int i = 2; i*i <= max; i++) {
            if (!isPresent[i] || visited[i]) {
                continue;
            }
            // code reaches here - it is present but not visited;
            visited[i] = true;
            int j = i*i, tempLength = 1;
            // we need to add j > 0
            while (j > 0 && j <= max && isPresent[j]) {
                visited[j] = true;
                tempLength++;
                j = j*j;
            }
            result = Math.max(result, tempLength);
        }
        return result > 1 ? result : -1;
    }

}
