package com.leetcode.majorityElement;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MajorityElement
 * 14/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int majorityElement(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(majorityElement(new int[]{3,2,3}), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(majorityElement(new int[]{2,2,1,1,1,2,2}), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(majorityElement(new int[]{2,2,1,-7,1,2,2}), 2);
    }
}