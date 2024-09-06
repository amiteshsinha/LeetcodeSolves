package com.leetcode.maxLenSubArrPositiveProdt;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * MaxLengthOfSubArrayWithPositiveProd
 * 05/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int getMaxLen(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getMaxLen(new int[]{1,-2,-3,4}), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getMaxLen(new int[]{0,1,-2,-3,-4}), 3);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getMaxLen(new int[]{-1,-2,-3,0,1}), 2);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(getMaxLen(new int[]{0,0,0,0}), 0);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(getMaxLen(new int[]{-2,-2,-3,0,-3,-2,1,3}), 4);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(getMaxLen(new int[]{-1,2}), 1);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(getMaxLen(new int[]{-1,2,3,4}), 3);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(getMaxLen(new int[]{-1,2,3,4,-2,-3}), 5);
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(getMaxLen(new int[]{-1,2,0,-1,2,3}), 2);
    }

    @Test
    public void should_give_correct_output10() {
        assertEquals(getMaxLen(new int[]{1,2,3,5,-6,4,0,10}), 4);
    }

    @Test
    public void should_give_correct_output11() {
        assertEquals(getMaxLen(new int[]{-1000000000,-1000000000}), 2);
    }

    @Test
    public void should_give_correct_output12() {
        assertEquals(getMaxLen(new int[]{5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2}), 8);
    }
}