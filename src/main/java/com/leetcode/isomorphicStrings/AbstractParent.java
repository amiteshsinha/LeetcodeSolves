package com.leetcode.isomorphicStrings;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * IsomorphicStrings
 * 23/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isIsomorphic(String s, String t);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(isIsomorphic("badc", "baba"), false);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(isIsomorphic("egg", "add"), true);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(isIsomorphic("paper", "title"), true);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(isIsomorphic("foo", "bar"), false);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(isIsomorphic("\u0000\u0000", "\u0000c"), false);
    }
}