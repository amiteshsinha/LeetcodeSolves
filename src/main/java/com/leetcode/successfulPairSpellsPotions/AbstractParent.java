package com.leetcode.successfulPairSpellsPotions;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SuccessfulPairOfSpellsAndPotions
 * 20/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] successfulPairs(int[] spells, int[] potions, long success);

    @Test
    public void should_give_correct_output1() {
        assertEquals(successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7), new int[]{4,0,3});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16), new int[]{2,0,2});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,7}, 14), new int[]{3,0,1});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(successfulPairs(new int[]{15,39,38,35,33,25,31,12,40,27,29,16,22,24,7,36,29,34,24,9,11,35,21,3,33,10,9,27,35,17,14,3,35,35,39,23,35,14,31,7},
                new int[]{25,19,30,37,14,30,38,22,38,38,26,33,34,23,40,28,15,29,36,39,39,37,32,38,8,17,39,20,4,39,39,7,30,35,29,23}, 317),
                new int[]{28,33,33,33,33,33,33,23,34,33,33,29,32,33,0,33,33,33,33,13,22,33,31,0,33,17,13,33,33,30,27,0,33,33,33,33,33,27,33,0});
    }
}