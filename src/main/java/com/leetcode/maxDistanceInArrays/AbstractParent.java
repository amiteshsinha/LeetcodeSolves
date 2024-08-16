package com.leetcode.maxDistanceInArrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;

/**
 * MaxDistanceInArrays
 * 16/08/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxDistance(List<List<Integer>> arrays);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maxDistance(asList(asList(1,2,3), asList(4,5), asList(1,2,3))), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maxDistance(asList(asList(1), asList(1))), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(maxDistance(asList(asList(1,5), asList(3,4))), 3);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(maxDistance(asList(
                asList(-7,-7,-5,-2,0,4),
                asList(-7,-6,-3,1),
                asList(-10,-9,-4,2,2,4,4),
                asList(-6,-6,-5,-4,-4,-1,1,1,2))), 14);
    }
}