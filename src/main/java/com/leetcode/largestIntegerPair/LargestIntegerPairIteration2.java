package com.leetcode.largestIntegerPair;

public class LargestIntegerPairIteration2 extends AbstractParent {

    /**
     * wont work if the array is [-7,7,7,2]
     * @param nums
     * @return
     */
    @Override
    public int findMaxK(int[] nums) {
        int maxK = -1, j = 0, k = 0;
        int[] arr = new int[1001];
        for (int i : nums) {
            k = 0;
            if (i < 0) {
                if (arr[-i] >= 0) {
                    arr[-i] += i;
                    j = -i;
                }
                k = arr[-i];
            } else {
                if (arr[i] <= 0) {
                    arr[i] += i;

                    j = i;
                }
                k = arr[i];
            }
            if (i != 0 && k == 0) {
                maxK = Math.max(j, maxK);
            }
        }
        return maxK;
    }
}
