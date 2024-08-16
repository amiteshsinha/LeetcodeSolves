package com.leetcode.firstMissingPositive;

public class firstMissingPositive extends AbstractFirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        //if nums.length == 1 then find out what no
        // find the min and max +ve no in 1 iteration
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] > 0) {
                 if (nums[i] < min) {
                     min = nums[i];
                 }
                 if (nums[i] > max) {
                     max = nums[i];
                 }
             }
         }
        if (min > 1 || max < 0) {
            return 1;
        }
        // create a bool array of size max - min
        boolean[] arr = new boolean[(max - min + 1) > Integer.MAX_VALUE ? Integer.MAX_VALUE: max - min + 1];
        // iterate through the 1st array and change boolarr[arr[i] - min] = true
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[nums[i] - min] = true;
            }
        }
        // iterate again the 1st no which is false is returned
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return i + min;
            }
        }
        // if no number is found in array - return max + 1
        return max + 1;
    }
}
