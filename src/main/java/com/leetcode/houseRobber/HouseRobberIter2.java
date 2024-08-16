package com.leetcode.houseRobber;

public class HouseRobberIter2 extends AbstractParent {

    int maxMoney = 0;

    /**
     *Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 40.49
     * MB
     * Beats
     * 95.05%
     * of users with Java
     * @param nums
     * @return
     */
    @Override
    public int rob(int[] nums) {
        int[] memory = new int[nums.length + 1];
        memory[0] = 0;
        memory[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            memory[i + 1] = Math.max(memory[i], memory[i - 1] + nums[i]);
        }
        return memory[nums.length];
    }
}
