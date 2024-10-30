package com.leetcode.subsequence.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime
 * 2
 * ms
 * Beats
 * 99.60%
 *
 * Memory
 * 43.51
 * MB
 * Beats
 * 98.34%
 * This file was created on 30/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class LongestIncreasingSubsequenceIter1 extends AbstractParent {

    @Override
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int curr = 0;
        for (int num : nums) {
            // using binary search to figure out whether we have encountered the number or larger number
            // if we have encountered a larger number
            int res = binarySearch(dp, curr, num);
            if (res == curr) {
                dp[curr] = num;
                curr++;
            } else {
                dp[res] = num;
            }
        }
        return curr;
    }

    private int binarySearch(int[] l,int curr, int item) {
        int start = 0;
        int end = curr;

        if (start == end) {
            return 0;
        }

        while (start < end) {
            int midx = (start + end) / 2;
            if (l[midx] < item) {
                start = midx + 1;
            } else {
                end = midx;
            }
        }

        return end;
    }

}
