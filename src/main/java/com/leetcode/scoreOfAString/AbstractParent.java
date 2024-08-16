package com.leetcode.scoreOfAString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * ScoreOfAString
 * 01/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int scoreOfString(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(scoreOfString("hello"), 13);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(scoreOfString("zaz"), 50);
    }
}