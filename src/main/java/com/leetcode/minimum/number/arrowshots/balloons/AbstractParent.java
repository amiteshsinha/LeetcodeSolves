package com.leetcode.minimum.number.arrowshots.balloons;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinNumberArrowToBurstBalloons
 * 18/03/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findMinArrowShots(int[][] points);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}), 4);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}), 2);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(findMinArrowShots(new int[][]{{1,9},{1,5},{3,12},{7,12},{8,12},{9,12},{12,16}}), 2);
    }
}