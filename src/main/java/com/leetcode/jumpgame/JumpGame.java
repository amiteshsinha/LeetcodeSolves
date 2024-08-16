package com.leetcode.jumpgame;

public class JumpGame extends AbstractParent {

    @Override
    public boolean canJump(int[] nums) {
        boolean[] jumpArray = new boolean[nums.length];
        if (nums.length == 1) {
            return true;
        }
        //cant start and length greater than 1- so return false;
        if (nums[0] == 0) {
            return false;
        } else {
            jumpArray[0] = true;
        }
        int noOfAllowedJumps = 0;
        int lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            noOfAllowedJumps = nums[i];
            if (jumpArray[i]) {
                if (i + noOfAllowedJumps >= lastIndex) {
                    return true;
                }
                for (int j = 1; j <= noOfAllowedJumps && j < nums.length; j++) {
                    jumpArray[i + j] = true;
                }
            }
        }
        return jumpArray[nums.length - 1];
    }
}
