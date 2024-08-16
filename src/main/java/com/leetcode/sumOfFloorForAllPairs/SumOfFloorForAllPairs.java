package com.leetcode.sumOfFloorForAllPairs;

public class SumOfFloorForAllPairs extends AbstractParent {

    @Override
    public int getSumOfFloorForAllPairs(int[] nums) {
        double sum = 0;
        int max = 0;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        int[] countArr = new int[max + 1];
        for (int i : nums) {
            countArr[i]++;
        }
        int i = 0, j;
        while (i < countArr.length) {
            do {
                i++;
            } while (i < countArr.length && countArr[i] == 0);
            for (j = i; j < countArr.length; j++) {
                if (countArr[j] != 0) {
                    sum += Math.floor(j/i)*countArr[i]*countArr[j];
                }
            }

        }
        return (int)(sum % 1000003);
    }




    // this approach will not work for duplicate entries in the array
//    @Override
//    public int getSumOfFloorForAllPairs(int[] nums) {
//        int sum = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j]/nums[i];
//            }
//        }
//        return sum;
//    }
}
