package com.leetcode.singleNumber3;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SingleNumber3
 * 31/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] singleNumber(int[] nums);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(singleNumber(new int[]{1,2,1,3,2,5}), new int[]{5,3});
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(singleNumber(new int[]{4,2,1,6,4,2,3,3}), new int[]{6,1});
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(singleNumber(new int[]{2,1,2,3,4,1}), new int[]{4,3});
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(singleNumber(new int[]{2,4,2,6,4,6,8,16}), new int[]{16,8});
    }
}