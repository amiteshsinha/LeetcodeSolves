package com.leetcode.handOfStraights;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * HandOfStraights
 * 06/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isNStraightHand(int[] hand, int groupSize);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(isNStraightHand(new int[]{1,2,3,4,5}, 4));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(isNStraightHand(new int[]{1,2,30,3,31,32,7,4,33,4,6,5}, 4));
    }

    @Test
    public void should_give_correct_output4() {
        assertFalse(isNStraightHand(new int[]{1,2,3,4,2,3,4,5,3,4,5,6,4,5,6,8}, 4));
    }

    @Test
    public void should_give_correct_output5() {
        assertTrue(isNStraightHand(new int[]{1,2,3,4,2,3,4,5,3,4,5,6,4,5,6,7}, 4));
    }

    @Test
    public void should_give_correct_output6() {
        assertTrue(isNStraightHand(new int[]{0,1}, 2));
    }
}