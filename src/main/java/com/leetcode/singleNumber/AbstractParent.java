package com.leetcode.singleNumber;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SingleNumber
 * 27/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int singleNumber(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(singleNumber(new int[]{2,2,1}), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(singleNumber(new int[]{4,1,2,1,2}), 4);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(singleNumber(new int[]{4}), 4);
    }
}