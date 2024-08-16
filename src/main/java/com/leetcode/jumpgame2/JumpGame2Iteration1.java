package com.leetcode.jumpgame2;

import java.util.Arrays;

public class JumpGame2Iteration1 extends AbstractParent {

    @Override
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int indexTillWeCanJump = 0, prevCount, currCount = 0, nextIndexTillWhichWeCanJump = 0;
        indexTillWeCanJump = nums[0];
        prevCount = 1;
        int lastIndex = nums.length - 1;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < lastIndex; i++) {
            if (indexTillWeCanJump >= lastIndex) {
                return prevCount;
            }
            if (nums[i] == 0) {
                continue;
            }
            if (i <= indexTillWeCanJump && i + nums[i] >= indexTillWeCanJump) {
                nextIndexTillWhichWeCanJump = Math.max(nextIndexTillWhichWeCanJump, i + nums[i]);
                currCount = prevCount + 1;
            } else {
                prevCount = currCount;
                indexTillWeCanJump = nextIndexTillWhichWeCanJump;
                nextIndexTillWhichWeCanJump = Math.max(nextIndexTillWhichWeCanJump, i + nums[i]);;
                currCount = prevCount + 1;
            }
            if (nextIndexTillWhichWeCanJump >= lastIndex) {
                return currCount;
            }

        }
        return prevCount;
    }
}
