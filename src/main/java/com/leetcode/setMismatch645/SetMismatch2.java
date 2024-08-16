package com.leetcode.setMismatch645;

public class SetMismatch2 extends AbstractParent {

    @Override
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int duplicate = 0; int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                duplicate = nums[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }

    /**
     * slight modification but its faster by 1 second - maybe because in 1 loop it runs without any checks
     * and in second loop it is only referring to a single array.
     * @param nums
     * @return
     */
    public int[] findErrorNums2(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int duplicate = 0; int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                duplicate = i;
            }
            if (arr[i] == 0) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}
