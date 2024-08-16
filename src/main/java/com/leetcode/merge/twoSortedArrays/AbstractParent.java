package com.leetcode.merge.twoSortedArrays;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MergeTwoSortedArrays
 * 26/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] merge(int[] arr1, int[] arr2);

    @Test
    public void should_give_correct_output1() {
        int[] result = merge(new int[]{1,2,4},new int[]{1,3,4});
        Assert.assertEquals(result, new int[]{1,1,2,3,4,4});
    }

    @Test
    public void should_give_correct_output2() {
        int[] result = merge(new int[]{},new int[]{});
        Assert.assertEquals(result, new int[]{});
    }

    @Test
    public void should_give_correct_output3() {
        int[] result = merge(new int[]{},new int[]{0});
        Assert.assertEquals(result, new int[]{0});
    }

    @Test
    public void should_give_correct_output4() {
        int[] result = merge(new int[]{1,3,5,7},new int[]{2,4,6,8});
        Assert.assertEquals(result, new int[]{1,2,3,4,5,6,7,8});
    }

    @Test
    public void should_give_correct_output5() {
        int[] result = merge(new int[]{1,3,4,7},new int[]{2,5,6,8,9});
        Assert.assertEquals(result, new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void should_give_correct_output6() {
        int[] result = merge(new int[]{2},new int[]{});
        Assert.assertEquals(result, new int[]{2});
    }

    @Test
    public void should_give_correct_output7() {
        int[] result = merge(new int[]{2},new int[]{1});
        Assert.assertEquals(result, new int[]{1,2});
    }

    @Test
    public void should_give_correct_output8() {
        int[] result = merge(new int[]{2,4,6},new int[]{1,3,4,5});
        Assert.assertEquals(result, new int[]{1,2,3,4,4,5,6});
    }
}