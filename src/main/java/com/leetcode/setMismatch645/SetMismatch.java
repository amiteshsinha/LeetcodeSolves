package com.leetcode.setMismatch645;

import java.util.HashSet;
import java.util.Set;

/**
 * Keep adding to set - if addition to set returns false - it means that the current number is duplicate
 * AP of numbers from 1 to nums.length will give expected total sum.
 * find total of the current array and subtract it from the expected total sum
 * - this would be the difference between the duplicate and the missing no
 * add this diff to duplicate to get the missing no
 *
 * space complexity O(n) (extra set)
 * time complexity - set addition O(n), number addition O(n) , calculation = O(1)
 */
public class SetMismatch extends AbstractParent {

    @Override
    public int[] findErrorNums(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        int duplicate = 0; int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!intSet.add(nums[i])) {
                duplicate = nums[i];
            }
            sum = sum + nums[i];
        }
        return new int[]{duplicate, duplicate + (nums.length*(nums.length + 1)/2  - sum)};
    }
}
