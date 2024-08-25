package com.leetcode.strangePrinter;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * StrangePrinter
 * 23/08/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int strangePrinter(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(strangePrinter("abcabc"), 5);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(strangePrinter("tbgtgb"), 4);
    }

    @Test
    public void should_give_correct_output3() {
    }
}