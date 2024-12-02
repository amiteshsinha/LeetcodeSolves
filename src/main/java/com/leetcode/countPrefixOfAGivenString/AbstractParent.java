package com.leetcode.countPrefixOfAGivenString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * countPrefixOfAGivenString
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int countPrefixes(String[] words, String s);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(countPrefixes(new String[]{"a","b","c","ab","bc","abc"}, "abc"), 3);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(countPrefixes(new String[]{"a","a"}, "aa"), 2);
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
