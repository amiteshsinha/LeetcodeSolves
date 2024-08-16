package com.leetcode.boatsToSavePeople.m881;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * BoatsToSavePeople
 * 07/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numRescueBoats(int[] people, int limit);

    @Test
    public void should_give_correct_output1() {
        int[] people = {1,2};
        Assert.assertEquals(numRescueBoats(people, 3), 1);
    }

    @Test
    public void should_give_correct_output2() {
        int[] people = {3,2,2,1};
        Assert.assertEquals(numRescueBoats(people, 3), 3);
    }

    @Test
    public void should_give_correct_output3() {
        int[] people = {3,5,3,4};
        Assert.assertEquals(numRescueBoats(people, 5), 4);
    }

    @Test
    public void should_give_correct_output4() {
        int[] people = {2,2};
        Assert.assertEquals(numRescueBoats(people, 6), 1);
    }

    @Test
    public void should_give_correct_output5() {
        int[] people = {2,3,2};
        Assert.assertEquals(numRescueBoats(people, 6), 2);
    }

    @Test
    public void should_give_correct_output6() {
        int[] people = {1,2,3,4,5};
        Assert.assertEquals(numRescueBoats(people, 5), 3);
    }

    @Test
    public void should_give_correct_output7() {
        int[] people = {1,2,3,4,5};
        Assert.assertEquals(numRescueBoats(people, 7), 3);
    }

    @Test
    public void should_give_correct_output8() {
        int[] people = {2,3,2};
        Assert.assertEquals(numRescueBoats(people, 4), 2);
    }

}