package com.leetcode.avgWaitTime;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * AvgWaitTimeResteraunt
 * 09/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract double averageWaitingTime(int[][] customers);

    @Test
    public void should_give_correct_output1() {
        assertEquals(averageWaitingTime(new int[][]{{1,2},{2,5},{4,3}}), 5.00000);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(averageWaitingTime(new int[][]{{5,2},{5,4},{10,3},{20,1}}), 3.25000);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(averageWaitingTime(new int[][]{{1,6894},{1,5521},{1,9696},{1,4801},{2,4930},{3,8659},{3,5511},{4,3966},{4,5290},
                {4,9620},{4,1380},{4,7234},{4,2316}}), 44029.69231);
    }
}