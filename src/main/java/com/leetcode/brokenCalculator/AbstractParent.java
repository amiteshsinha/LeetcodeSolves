package com.leetcode.brokenCalculator;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * BrokenCalculator
 * 05/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int brokenCalc(int startValue, int target);

    @Test
    public void should_give_correct_output1() {
        assertEquals(brokenCalc(3,8), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(brokenCalc(2,3), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(brokenCalc(3,10), 3);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(brokenCalc(5,8), 2);
    }
}