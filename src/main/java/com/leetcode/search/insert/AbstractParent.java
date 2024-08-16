package com.leetcode.search.insert;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SearchInsert
 * 06/06/23
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int searchInsert(int[] nums, int target);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(searchInsert(new int[]{1,3,5,6},5), 2);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(searchInsert(new int[]{1,3,5,6},2), 1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(searchInsert(new int[]{1,3,5,6},7), 4);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(searchInsert(new int[]{2,4,5,6},1), 0);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(searchInsert(new int[]{1,3,5,5,6,7},7), 5);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(searchInsert(new int[]{1,3,5,5,6,7},5), 2);
    }
}