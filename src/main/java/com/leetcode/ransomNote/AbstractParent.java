package com.leetcode.ransomNote;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * RansomNote
 * 21/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean canConstruct(String ransomNote, String magazine);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(canConstruct("a", "b"), false);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(canConstruct("aab", "ab"), false);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(canConstruct("aa", "aab"), true);
    }
}