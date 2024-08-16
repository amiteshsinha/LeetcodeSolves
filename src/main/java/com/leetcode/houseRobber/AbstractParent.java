package com.leetcode.houseRobber;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * HouseRobber
 * 11/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int rob(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(rob(new int[]{1,2,3,1}), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(rob(new int[]{2,7,9,3,1}), 12);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(rob(new int[]{114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,
                197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240}), 4173);
    }
}