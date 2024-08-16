package com.leetcode.trapping.rain.water;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * TrappingRainWater
 * 19/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int trap(int[] height);

    @Test
    public void should_give_correct_output0() {
        Assert.assertEquals(trap(new int[]{2,0,0,3}), 4);
    }

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}), 6);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(trap(new int[]{4,2,0,3,2,5}), 9);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(trap(new int[]{0,1,0,1,1,0,1,3,2,1,2,1}), 3);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(trap(new int[]{2,1,2}), 1);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(trap(new int[]{2,1,0,2}), 3);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(trap(new int[]{2,0,3}), 2);
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(trap(new int[]{3,1,2,3}), 3);
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertEquals(trap(new int[]{3,1,2,1}), 1);
    }

    @Test
    public void should_give_correct_output9() {
        Assert.assertEquals(trap(new int[]{5, 1, 3, 2, 4}), 6);
    }

    @Test
    public void should_give_correct_output10() {
        Assert.assertEquals(trap(new int[]{5, 1, 4, 2, 3}), 4);
    }

}