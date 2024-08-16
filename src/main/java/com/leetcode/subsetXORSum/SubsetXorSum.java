package com.leetcode.subsetXORSum;

public class SubsetXorSum extends AbstractParent {

    @Override
    public int subsetXORSum(int[] nums) {
        int sum = 0, tempSum, k, j;
        double totalCombinations = Math.pow(2, nums.length);
        for (int i = 1; i < totalCombinations; i++) {
            tempSum = 0;
            k = i;
            j = 0;
            while (k != 0) {
                if ((k & 1) != 0) {
                    tempSum = tempSum ^ nums[j];
                    // System.out.println(i + " : " + k + " : " + nums[j]);
                }
                j++;
                k = k >> 1;
            }
            sum += tempSum;
        }
        return sum;
    }
}
