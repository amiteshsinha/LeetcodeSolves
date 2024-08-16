package com.leetcode.mergeSortedArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MergeSortedArrays
 * 30/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract void merge(int[] nums1, int m, int[] nums2, int n);

    @Test
    public void should_give_correct_output1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        merge(nums1, 3, new int[]{2,5,6}, 3);
        Assert.assertEquals(nums1, new int[]{1,2,2,3,5,6});

    }

    @Test
    public void should_give_correct_output2() {
        int[] nums1 = new int[]{0};
        merge(nums1, 0, new int[]{1}, 1);
        Assert.assertEquals(nums1, new int[]{1});
    }

    @Test
    public void should_give_correct_output3() {
        int[] nums1 = new int[]{2,4,6,0,0,0,0};
        merge(nums1, 3, new int[]{1,3,4,5}, 4);
        Assert.assertEquals(nums1, new int[]{1,2,3,4,4,5,6});
    }

    @Test
    public void should_give_correct_output4() {
        int[] nums1 = new int[]{1,3,5,7,0,0,0,0};
        merge(nums1, 4, new int[]{2,4,6,8}, 4);
        Assert.assertEquals(nums1, new int[]{1,2,3,4,5,6,7,8});
    }

    @Test
    public void should_give_correct_output5() {
        int[] nums1 = new int[]{1,3,4,7,0,0,0,0,0};
        merge(nums1, 4,new int[]{2,5,6,8,9}, 5);
        Assert.assertEquals(nums1, new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void should_give_correct_output6() {
        int[] nums1 = new int[]{2, 0};
        merge(nums1, 1, new int[]{1}, 1);
        Assert.assertEquals(nums1, new int[]{1,2});
    }

    @Test
    public void should_give_correct_output7() {
        int[] nums1 = new int[]{1};
        merge(nums1, 1, new int[]{}, 0);
        Assert.assertEquals(nums1, new int[]{1});
    }
}