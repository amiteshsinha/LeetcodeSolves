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
public class LongestSquareStreakInArray extends AbstractParent {

    @Override
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 0) {
                max = Math.max(max, 1 + getLongestStreak(nums, i, nums[i], visited));
            }
        }
        return max > 1 ? max : -1;
    }

    private int getLongestStreak(int[] nums, int i, int num, int[] visited) {

        visited[i] = 1;
        int square = num*num;
        int index = Arrays.binarySearch(nums, i + 1, nums.length, square);
        if (index > 0) {
            return 1 + getLongestStreak(nums, index, square, visited);
        } else {
            return 0;
        }
    }

}
