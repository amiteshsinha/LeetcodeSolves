package com.leetcode.stoneGame.StoneGame1;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * StoneGame
 * 20/08/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean stoneGame(int[] piles);

    @Test
    public void should_give_correct_output1() {
        assertTrue(stoneGame(new int[]{5,3,4,5}));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(stoneGame(new int[]{3,7,2,3}));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(stoneGame(new int[]{8,9,7,6,7,6}));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(stoneGame(new int[]{7,7,12,16,41,48,41,48,11,9,34,2,44,30,27,12,11,39,31,8,23,11,47,25,15,23,4,17,11,50,16,50,38,34,48,27,16,24,22,
                48,50,10,26,27,9,43,13,42,46,24}));
    }
}