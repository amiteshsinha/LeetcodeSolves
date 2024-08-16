package com.leetcode.ipo;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * FindMaxCapitalForIPO
 * 15/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findMaximizedCapital(int k, int w, int[] profits, int[] capital);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findMaximizedCapital(3,0, new int[]{1,2,3}, new int[]{0,1,2}), 6);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findMaximizedCapital(2,0, new int[]{1,2,3}, new int[]{0,1,1}), 4);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findMaximizedCapital(3,1, new int[]{1,2,3,4}, new int[]{0,1,1,3}), 10);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(findMaximizedCapital(10,0, new int[]{1,2,3}, new int[]{0,1,2}), 6);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(findMaximizedCapital(11,11, new int[]{1,2,3}, new int[]{11,12,13}), 17);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(findMaximizedCapital(2,0, new int[]{1,2,3}, new int[]{0,9,10}), 1);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(findMaximizedCapital(1,10, new int[]{1,2,3}, new int[]{0,0,0}), 13);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(findMaximizedCapital(2,10, new int[]{1,2,3}, new int[]{0,0,0}), 15);
    }
}