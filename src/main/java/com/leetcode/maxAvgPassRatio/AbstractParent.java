package com.leetcode.maxAvgPassRatio;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MaxAvgPassRatio
 * <p>
 * This file was created on 15/12/24 / Sunday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract double maxAverageRatio(int[][] classes, int extraStudents);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxAverageRatio(new int[][]{{1,2},{3,5},{2,2}}, 2), 0.78333);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxAverageRatio(new int[][]{{2,4},{3,9},{4,5},{2,10}}, 4), 0.53485);
        }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxAverageRatio(new int[][]{{2,3},{2,3},{2,3}}, 3), 0.75);
    }
}
