package com.leetcode.subsetXORSum;

public class SubsetXorSumIter1 extends AbstractParent {

    @Override
    public int subsetXORSum(int[] nums) {
        System.out.println();
        return subsetXORSum(nums, 0 , 0);
    }

    int subsetXORSum(int[] nums, int i , int sum) {
        System.out.println(i + " : " + sum);
        if (i == nums.length) {
            return sum;
        } else {
            return subsetXORSum(nums, i + 1, sum ^ nums[i]) + subsetXORSum(nums, i + 1, sum);
        }
    }
}
