package com.leetcode.SingleNumber2;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SingleNumber2
 * 28/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int singleNumber(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(singleNumber(new int[]{2,2,3,2}), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(singleNumber(new int[]{0,1,0,1,0,1,99}), 99);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(singleNumber(new int[]{2,2,3,2,3,4,3,5,4,4}), 3);
    }
}