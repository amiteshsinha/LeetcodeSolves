package com.leetcode.SortTheJumbledNumbers;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SortTheJumbledNumbers
 * 24/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] sortJumbled(int[] mapping, int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(sortJumbled(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,38}),
                new int[]{338,38,991});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(sortJumbled(new int[]{0,1,2,3,4,5,6,7,8,9}, new int[]{789,456,123}),
                new int[]{123,456,789});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(sortJumbled(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,38}),
                new int[]{338,38,991});
    }
}