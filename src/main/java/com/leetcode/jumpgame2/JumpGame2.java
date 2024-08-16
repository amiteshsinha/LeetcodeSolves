package com.leetcode.jumpgame2;

import java.util.Arrays;

public class JumpGame2 extends AbstractParent {

    @Override
    public int jump(int[] nums) {
        int[] jumpArr = new int[nums.length];
        if (nums.length == 1) {
            return 0;
        }
        int maxJumpIndex = 0;
        int lastIndex = nums.length - 1;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < lastIndex; i++) {
            maxJumpIndex = nums[i];
            for (int j = 1; j <= maxJumpIndex && (i+j) <= lastIndex; j++) {
                if (jumpArr[i + j] == 0) {
                    jumpArr[i + j] = jumpArr[i] + 1;
                }
            }
            System.out.println(Arrays.toString(jumpArr));
            if (jumpArr[lastIndex] > 0) {
                return jumpArr[lastIndex];
            }
        }
        return jumpArr[lastIndex];
    }
}
