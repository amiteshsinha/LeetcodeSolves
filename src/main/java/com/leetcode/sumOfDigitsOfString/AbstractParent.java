package com.leetcode.sumOfDigitsOfString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * SumOfDigitsOfStringAfterConvert
 * 03/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int getLucky(String s, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getLucky("zbax", 2), 8);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getLucky("iiii", 1), 36);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getLucky("leetcode", 2), 6);
    }
}