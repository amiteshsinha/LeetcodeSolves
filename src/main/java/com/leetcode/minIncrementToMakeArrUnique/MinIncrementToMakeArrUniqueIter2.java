package com.leetcode.minIncrementToMakeArrUnique;

public class MinIncrementToMakeArrUniqueIter2 extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 91.21%
     *
     * Memory
     * 55.50
     * MB
     * Beats
     * 97.52%
     * @param nums
     * @return
     */
    @Override
    public int minIncrementForUnique(int[] nums) {
        int counter = 0, toAdd = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        // create a freq array of length max - min + 1 (to save space)
        // for every number figure out the frequency
        int[] countArr = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            countArr[nums[i] - min]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] >= 1) {
                counter += toAdd;
                toAdd += countArr[i] - 1;
            } else {
                // its 0 which means there is no number at this frequency
                if (toAdd > 0) {
                    counter += toAdd;
                    toAdd--;
                }
            }
        }
        // for remaining numbers
        while (toAdd > 0) {
            counter += toAdd;
            toAdd--;
        }
        return counter;
    }
}
