package com.leetcode.grumpyBookOwner;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * GrumpyBookOwnerIter1
 * 21/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxSatisfied(int[] customers, int[] grumpy, int minutes);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maxSatisfied(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1}, 3), 16);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maxSatisfied(new int[]{1}, new int[]{0}, 3), 1);
    }

    //1,0,1,2,1,3,7,5
    //0,1,0,1,1,1,0,1
    @Test
    public void should_give_correct_output3() {
        assertEquals(maxSatisfied(new int[]{1,0,1,2,1,3,7,5}, new int[]{0,1,0,1,1,1,0,1}, 3), 17);
    }
}