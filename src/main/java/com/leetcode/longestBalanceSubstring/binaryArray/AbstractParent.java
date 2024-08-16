package com.leetcode.longestBalanceSubstring.binaryArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * LongestBalancedSubstringBinaryArray
 * 27/04/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findTheLongestBalancedSubstring(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findTheLongestBalancedSubstring("01000111"), 6);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findTheLongestBalancedSubstring("00111"), 4);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(findTheLongestBalancedSubstring("010001"), 2);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(findTheLongestBalancedSubstring("111"), 0);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(findTheLongestBalancedSubstring(""), 0);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(findTheLongestBalancedSubstring("00000011100001111"), 8);
    }
}