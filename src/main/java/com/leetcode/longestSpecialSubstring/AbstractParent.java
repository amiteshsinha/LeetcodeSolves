package com.leetcode.longestSpecialSubstring;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * LongestSpecialSubstringOccuringAtleastThrice
 * <p>
 * This file was created on 10/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maximumLength(String s);

    /**
     * aaaa = 3 of length 2 (4-2)
     * aaaaa = 3 of length 3 (5-2), 2 of length 4 (5 - 1) and 1 of length 5 (5 - 0)
     * aaaaaa = 3 of length 4 (6 - 2), 2 of length 5 (6 - 1) and 1 of length 6 (6 - 0)
     * aaaaaabaaaaa = 3 of length 5 (2 of length 5 + 1 of length 5), 5 of length 4 (same as above)
     */
    @Test
    public void should_give_correct_output_1() {
        assertEquals(maximumLength("aaaa"),2);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maximumLength("abcdef"),-1);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maximumLength("abcaba"),1);
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(maximumLength("aaaaaabaaaaa"),5);
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(maximumLength("aaabaaacaaa"),3);
    }

    @Test
    public void should_give_correct_output_6() {
        assertEquals(maximumLength("ceeeeeeeeeeeebmmmfffeeeeeeeeeeeewww"),11);
    }
}
