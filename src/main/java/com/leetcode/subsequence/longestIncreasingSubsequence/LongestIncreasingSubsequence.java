package com.leetcode.subsequence.longestIncreasingSubsequence;

import java.util.Arrays;

/**
 * This file was created on 30/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class LongestIncreasingSubsequence extends AbstractParent {

    @Override
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;
        dp[0] = 1;
        //System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            for (int k = i - 1; k >= 0; k--) {
                if (nums[k] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[k]);
                }
            }
            dp[i] += 1;
            if (dp[i]  > max) {
                max = dp[i];
            }
            //System.out.println(Arrays.toString(dp));
        }
        return max;
    }

}
