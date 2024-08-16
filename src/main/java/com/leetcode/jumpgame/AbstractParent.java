package com.leetcode.jumpgame;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * JumpGame
 * 29/04/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean canJump(int[] nums);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(canJump(new int[]{2,3,1,1,4}), true);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(canJump(new int[]{3,2,1,0,4}), false);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(canJump(new int[]{4,0,0,0,4}), true);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(canJump(new int[]{0,1,2,3,4,4}), false);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(canJump(new int[]{0}), true);
    }


    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(canJump(new int[]{1,0,1,0}), false);
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(canJump(new int[]{1,2}), true);
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertEquals(canJump(new int[]{1,2,3}), true);
    }
}