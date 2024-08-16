package com.leetcode.courseSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * CourseSchedule
 * 22/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean canFinish(int numCourses, int[][] prerequisites);

    @Test
    public void should_give_correct_output1() {
        assertTrue(canFinish(2, new int[][]{{1,0}}));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(canFinish(4, new int[][]{{1,0}, {2,0}, {3,1}, {3,2}}));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(canFinish(2, new int[][]{{1,0}, {0,1}}));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(canFinish(4, new int[][]{{3,1}, {3,2}, {3,0}, {1,2}, {2,0}}));
    }

    @Test
    public void should_give_correct_output5() {
        assertFalse(canFinish(4, new int[][]{{1,2}, {2,0}, {3,1}, {0, 1}}));
    }

    @Test
    public void should_give_correct_output6() {
        assertTrue(canFinish(1, new int[][]{{}}));
    }

    @Test
    public void should_give_correct_output7() {
        assertTrue(canFinish(3, new int[][]{{}}));
    }

    @Test
    public void should_give_correct_output8() {
        assertTrue(canFinish(3, new int[][]{{1,0}}));
    }

    @Test
    public void should_give_correct_output9() {
        assertTrue(canFinish(7, new int[][]{{1,0},{0,3},{0,2},{3,2},{2,5},{4,5},{5,6},{2,4}}));
    }
}