package com.leetcode.jumpgame;

public class JumpGameIteration1 extends AbstractParent {

    @Override
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        //cant start and length greater than 1- so return false;
        if (nums[0] == 0) {
            return false;
        }
        int maxJumpIndex = nums[0];
        int lastIndex = nums.length - 1;
        for (int i = 1; i < lastIndex; i++) {
            if (maxJumpIndex >= i) {
                maxJumpIndex = Math.max(i + nums[i], maxJumpIndex);
                if (maxJumpIndex >= lastIndex) {
                    return true;
                }
            } else if (maxJumpIndex == i && nums[i] == 0) {
                //cant proceed beyond this step
                return false;
            }

        }
        return maxJumpIndex >= lastIndex;
    }
}
