package com.leetcode.studentReplaceChalk;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * StudentReplaceChalk
 * 03/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int chalkReplacer(int[] chalk, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(chalkReplacer(new int[]{5,1,5}, 22), 0);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(chalkReplacer(new int[]{3,4,1,2}, 25), 1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(chalkReplacer(new int[]{5,1,5}, 27), 1);
    }
}