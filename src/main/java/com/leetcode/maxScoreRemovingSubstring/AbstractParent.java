package com.leetcode.maxScoreRemovingSubstring;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MaxScoreRemovingSubstring
 * 12/07/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maximumGain(String s, int x, int y);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maximumGain("cdbcbbaaabab", 4,5), 19);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maximumGain("aabbaaxybbaabb", 5,4), 20);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(maximumGain("aabbabkbbbfvybssbtaobaaaabataaadabbbmakgabbaoapbbbbobaabvqhbbzbbkapabaavbbeghacabamdpaaqbqabbjbababmbakbaabaj"
                + "abasaabbwabrbbaabbafubayaazbbbaababbaaha",1926 ,4320), 112374);
    }
}