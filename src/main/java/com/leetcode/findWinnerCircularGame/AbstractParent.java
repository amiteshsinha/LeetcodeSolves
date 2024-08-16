package com.leetcode.findWinnerCircularGame;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * FindWinnerCircularGame
 * 08/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findTheWinner(int n, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findTheWinner(5,2),3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findTheWinner(6,5),1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findTheWinner(3,1),3);
    }
}