package com.leetcode.jumpgame2;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * JumpGame2
 * 29/04/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int jump(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(jump(new int[]{2,3,1,1,4}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(jump(new int[]{2,3,0,1,4}), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(jump(new int[]{4,0,0,0,4}), 1);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(jump(new int[]{0}), 0);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(jump(new int[]{1,1,1,0}), 3);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(jump(new int[]{1,2}), 1);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(jump(new int[]{1,2,3}), 2);
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(jump(new int[]{3,0,0,2,0,2,0,2,0,4}), 4);
    }

    @Test
    public void should_give_correct_output10() {
        assertEquals(jump(new int[]{3,0,0,2,5,2,0,2,0,4}), 3);
    }

    @Test
    public void should_give_correct_output11() {
        assertEquals(jump(new int[]{2,3,1}), 1);
    }

    @Test
    public void should_give_correct_output12() {
        assertEquals(jump(new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3}), 2);
    }

    @Test
    public void should_give_correct_output13() {
        assertEquals(jump(new int[]{3,1,1,1,1}), 2);
    }
}