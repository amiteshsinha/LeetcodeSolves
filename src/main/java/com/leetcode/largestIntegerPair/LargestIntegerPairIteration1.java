package com.leetcode.largestIntegerPair;

public class LargestIntegerPairIteration1 extends AbstractParent {

    @Override
    public int findMaxK(int[] nums) {
        int maxK = -1;
        int[] arr = new int[1001];
        for (int i : nums) {
            if (i < 0) {
                arr[-i] = i;
            }
        }
        for (int j : nums) {
            if (j > 0 && arr[j] != 0) {
                maxK = Math.max(j, maxK);
            }
        }
        return maxK;
    }
}
