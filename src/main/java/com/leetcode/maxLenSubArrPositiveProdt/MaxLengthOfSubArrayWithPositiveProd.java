package com.leetcode.maxLenSubArrPositiveProdt;

public class MaxLengthOfSubArrayWithPositiveProd extends AbstractParent {

    // goal is to maximize the length of subarray not max length with max positive product
    @Override
    public int getMaxLen(int[] nums) {
        int positive = 0, negative = 0, max = 0, temp;
        for (int i : nums) {
            if (i == 0) {
                positive = 0;
                negative = 0;
            } else if (i > 0) {
                positive++;
                negative = (negative == 0) ? 0 : negative + 1;
            } else {
                temp = positive;
                positive = (negative == 0) ? 0 : negative + 1;
                negative = temp + 1;
            }
            max = Math.max(positive, max);
        }
        return max;
    }
}
