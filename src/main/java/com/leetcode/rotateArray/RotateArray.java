package com.leetcode.rotateArray;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99}; int k = 5;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) {
           k  = k % nums.length;
           if (k == 0) {
               System.out.println("returning because k = 0");
               return;
           }
        }
        int[] rotatedArray = new int[nums.length];
        for (int i= 0; i < nums.length; i++) {
            if ((i + k) < nums.length) {
                rotatedArray[i + k] = nums[i];
            } else {
                rotatedArray[i + k - nums.length] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotatedArray[i];
        }
        return;
    }
}
