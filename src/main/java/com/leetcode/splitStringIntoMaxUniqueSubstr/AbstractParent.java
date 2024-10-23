package com.leetcode.splitStringIntoMaxUniqueSubstr;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * SplitStringIntoMaxUniqueSubstrings
 * <p>
 * This file was created on 21/10/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxUniqueSplit(String s);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxUniqueSplit("ababccc"), 5);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxUniqueSplit("aba"), 2);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxUniqueSplit("aa"), 1);
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(maxUniqueSplit("aaa"), 2);
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(maxUniqueSplit("aaaaaa"), 3);
    }

    @Test
    public void should_give_correct_output_6() {
        assertEquals(maxUniqueSplit("wwwzfvedwfvhsww"), 11);
    }
}
