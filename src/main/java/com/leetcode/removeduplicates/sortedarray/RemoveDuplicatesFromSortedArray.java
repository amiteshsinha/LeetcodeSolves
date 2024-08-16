package com.leetcode.removeduplicates.sortedarray;

public class RemoveDuplicatesFromSortedArray extends AbstractParent {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        // length greater or equal to 2
        int retVal = 1;
        int left = 0;
        int lo = 0;
        int currVal = nums[0];
        while (left < nums.length && lo < nums.length) {
            while (lo < (nums.length - 2) && nums[lo] == nums[lo + 1]){
                lo++;
            }
            lo++;
            //now that lo is equal to max nums.length - 1
            if (lo < nums.length && nums[left] != nums[lo]) {
                left++;
                nums[left] = nums[lo];
                retVal++;
            }
        }
        return retVal;
    }
}
