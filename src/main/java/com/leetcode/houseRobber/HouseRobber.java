package com.leetcode.houseRobber;

public class HouseRobber extends AbstractParent {

    int maxMoney = 0;

    /**
     * Time limit exceeded
     * @param nums
     * @return
     */
    @Override
    public int rob(int[] nums) {
        int[] memory = new int[nums.length];
        rob(nums, 0, 0);
        return maxMoney;
    }

    private void rob(int[] nums, int currIndex, int currSum) {
        if (currIndex >= nums.length) {
            maxMoney = Math.max(maxMoney, currSum);
            return;
        }
        // consider current number
        currSum += nums[currIndex];
        rob(nums, currIndex + 2, currSum);
        currSum -= nums[currIndex];
        // dont consider the current number
        rob(nums, currIndex + 1, currSum);


    }
}
