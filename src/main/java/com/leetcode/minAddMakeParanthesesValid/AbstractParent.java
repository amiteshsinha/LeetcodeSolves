package com.leetcode.minAddMakeParanthesesValid;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinAddToMakeParanthesesValid
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int minAddToMakeValid(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minAddToMakeValid("())"), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minAddToMakeValid("((("), 3);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minAddToMakeValid("())())"), 2);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minAddToMakeValid("()))(("), 4);
    }
}
