package com.leetcode.houseRobber;

import java.util.Arrays;

public class HouseRobberIter1 extends AbstractParent {

    int maxMoney = 0;

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 40.96
     * MB
     * Beats
     * 36.02%
     * of users with Java
     * Time limit exceeded
     * @param nums
     * @return
     */
    @Override
    public int rob(int[] nums) {
        int[] memory = new int[nums.length];
        Arrays.fill(memory, -1);
        return rob(nums,memory, nums.length - 1);
    }

    private int rob(int[] nums,int[] memory, int currIndex) {
        if (currIndex < 0) {
            return 0;
        }
        if (memory[currIndex] > -1) {
            return memory[currIndex];
        }
        int max = Math.max(rob(nums,memory, currIndex - 2) + nums[currIndex],
                rob(nums,memory, currIndex -1));
        memory[currIndex] = max;
        return max;
    }
}
