package com.leetcode.robotCollisions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * RobotCollisions
 * 13/07/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions);

    @Test
    public void should_give_correct_output1() {
        assertEquals(survivedRobotsHealths(new int[]{5,4,3,2,1}, new int[]{2,17,9,15,10}, "RRRRR"),
                Arrays.asList(2,17,9,15,10));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(survivedRobotsHealths(new int[]{3,5,2,6}, new int[]{10,10,15,12}, "RLRL"),
                Arrays.asList(14));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(survivedRobotsHealths(new int[]{1,2,5,6}, new int[]{10,10,11,11}, "RLRL"),
                Arrays.asList());
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(survivedRobotsHealths(new int[]{3,47}, new int[]{46,26}, "LR"),
                Arrays.asList(46,26));
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(survivedRobotsHealths(new int[]{11,44,16}, new int[]{1,20,17}, "RLR"),
                Arrays.asList(18));
    }
}