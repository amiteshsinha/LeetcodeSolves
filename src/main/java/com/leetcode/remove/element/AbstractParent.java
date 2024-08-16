package com.leetcode.remove.element;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

public abstract class AbstractParent {

    public abstract int removeElement(int[] nums, int val);

    private void testMethod(int[] nums, int val, int[] expectedNums) {
        int k = removeElement(nums, val); // Calls your implementation
        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void should_return_correct_val1() {
        int [] nums = {3,2,2,3}; int val = 3; int[] expectedNums = {2,2};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val2() {
        int[] nums = {0,1,2,2,3,0,4,2};int val = 2; int[] expectedNums = {0,0,1,3,4};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val3() {
        int[] nums = {1};int val = 1; int[] expectedNums = {};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val4() {
        int[] nums = {0,1};int val = 1; int[] expectedNums = {0};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val5() {
        int[] nums = {1,1,1,1};int val = 1; int[] expectedNums = {};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val6() {
        int[] nums = {0,2,0,1};int val = 1; int[] expectedNums = {0,0,2};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val7() {
        int[] nums = {0,3,2,1,1,1};int val = 1; int[] expectedNums = {0,2,3};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val8() {
        int[] nums = {2};int val = 3; int[] expectedNums = {2};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val9() {
        int[] nums = {4,5};int val = 4; int[] expectedNums = {5};
        testMethod(nums,val,expectedNums);
    }

    @Test
    public void should_return_correct_val10() {
        int[] nums = {4,4,4,6,5};int val = 4; int[] expectedNums = {5,6};
        testMethod(nums,val,expectedNums);
    }
}
