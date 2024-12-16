package com.leetcode.mostVisitedInCircularTrack;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertTrue;

/**
 * MostVisitedSectorInCircularTrack
 * <p>
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract List<Integer> mostVisited(int n, int[] rounds);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(mostVisited(4, new int[]{1,3,1,2}).containsAll(asList(1,2)));
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(mostVisited(2, new int[]{2,1,2,1,2,1,2,1,2}).containsAll(asList(2)));
    }

    @Test
    public void should_give_correct_output_3() {
        assertTrue(mostVisited(7, new int[]{1,3,5,7}).containsAll(asList(1,2,3,4,5,6,7)));
    }
}
