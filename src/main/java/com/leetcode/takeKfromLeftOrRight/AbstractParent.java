package com.leetcode.takeKfromLeftOrRight;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * TakeKCharsFromLeftorRight
 * 08/04/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int takeCharacters(String s, int k);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(takeCharacters("a", 1),- 1);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(takeCharacters("abc", 1),3);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(takeCharacters("abc", 2),-1);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(takeCharacters("aabaaaacaabc", 2),8);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(takeCharacters("aabacaabc", 2),7);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(takeCharacters("aababcaabc", 2),6);
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(takeCharacters("aababbacaabc", 2),7);
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertEquals(takeCharacters("acbcc",1),3);
    }
}