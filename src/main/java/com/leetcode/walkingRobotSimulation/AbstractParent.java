package com.leetcode.walkingRobotSimulation;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * WalkingRobotSimulation
 * 04/09/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int robotSim(int[] commands, int[][] obstacles);

    @Test
    public void should_give_correct_output1() {
        assertEquals(robotSim(new int[]{4,-1,3}, new int[][]{}), 25);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(robotSim(new int[]{4,-1,4,-2,4}, new int[][]{{2,4}}), 65);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(robotSim(new int[]{6,-1,-1,6}, new int[][]{}), 36);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(robotSim(new int[]{-2,-1,-2,3,7}, new int[][]{{1,-3},{2,-3},{4,0},{-2,5},{-5,2},{0,0},{4,-4},{-2,-5},{-1,-2},{0,2}}), 100);
    }
}