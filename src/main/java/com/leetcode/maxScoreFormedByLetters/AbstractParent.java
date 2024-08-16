package com.leetcode.maxScoreFormedByLetters;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MaxScoreByLetters
 * 24/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxScoreWords(String[] words, char[] letters, int[] score);

    @Test
    public void should_give_correct_output1() {
        int k = maxScoreWords(new String[]{"dog","cat","dad","good"}, new char[]{'a','a','c','d','d','d','g','o','o'},
                new int[]{1,0,9,5,0,0,3,0,0, 0,0, 0,0, 0,2,0,0,0,0,0,0,0,0,0,0,0});
        Assert.assertEquals(k , 23);
    }

    @Test
    public void should_give_correct_output2() {
        int k = maxScoreWords(new String[]{"xxxz","ax","bx","cx"}, new char[]{'z','a','b','c','x','x','x'},
                new int[]{4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10});
        Assert.assertEquals(k , 27);
    }

    @Test
    public void should_give_correct_output3() {
            int k = maxScoreWords(new String[]{"leetcode"}, new char[]{'l','e','t','c','o','d'},
                new int[]{0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0});
        Assert.assertEquals(k , 0);
    }
}