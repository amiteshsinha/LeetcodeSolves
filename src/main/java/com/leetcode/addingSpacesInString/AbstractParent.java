package com.leetcode.addingSpacesInString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * addingSpacesInString
 * <p>
 * This file was created on 03/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract String addSpaces(String s, int[] spaces);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}), "Leetcode Helps Me Learn");
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(addSpaces("icodeinpython", new int[]{1,5,7,9}), "i code in py thon");
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(addSpaces("spacing", new int[]{0,1,2,3,4,5,6}), " s p a c i n g");
    }
}
