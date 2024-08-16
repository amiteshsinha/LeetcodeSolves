package com.leetcode.mostProfitAssigningWork;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MostProfitAssigningWork
 * 18/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maxProfitAssignment(new int[]{2,4,6,8,10}, new int[]{10,20,30,40,50}, new int[]{4,5,6,7}), 100);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maxProfitAssignment(new int[]{85,47,57}, new int[]{24,66,99}, new int[]{40,25,25}), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(maxProfitAssignment(new int[]{68,35,52,47,86}, new int[]{67,17,1,81,3}, new int[]{92,10,85,84,82}), 324);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(maxProfitAssignment(new int[]{66,1,28,73,53,35,45,60,100,44,59,94,27,88,7,18,83,18,72,63},
                new int[]{66,20,84,81,56,40,37,82,53,45,43,96,67,27,12,54,98,19,47,77},
                new int[]{61,33,68,38,63,45,1,10,53,23,66,70,14,51,94,18,28,78,100,16}), 1392);
    }
}