package com.leetcode.sortColors;

public class SortColorsIter1 extends AbstractParent {

    // wont work because we dont know last pos of 0, 1, and 2
    @Override
    public void sortColors(int[] nums) {
        int k = nums.length - 1;
        int i = 0, j = k, temp;
        while (i < j) {
            if (i < k && nums[i] == 0) {
                i++;
                continue;
            }
            if (j > 0 && nums[j] == 2) {
                j--;
                continue;
            }
            // number at i is 1 or 2 number at j is 1 or 0
            if (nums[j] == 0) {
                nums[j] = nums[i];
                nums[i] = 0;
            } else if (nums[i] == 2) {
                nums[i] = nums[j];
                nums[j] = 2;
            } else {
                j--;
            }
        }
    }
}
