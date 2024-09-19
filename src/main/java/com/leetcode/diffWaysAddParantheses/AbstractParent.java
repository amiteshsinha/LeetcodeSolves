package com.leetcode.diffWaysAddParantheses;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * DiffWaysAddParantheses
 * 19/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> diffWaysToCompute(String expression);

    @Test
    public void should_give_correct_output0() {
        //((2-1)-1) = 0
        //(2-(1-1)) = 2
        assertEquals(diffWaysToCompute("11-23*5"), asList(-60,-104));
    }

    @Test
    public void should_give_correct_output1() {
        //((2-1)-1) = 0
        //(2-(1-1)) = 2
        assertEquals(diffWaysToCompute("2-1-1"), asList(0,2));
    }

    @Test
    public void should_give_correct_output2() {
        //(2*(3-(4*5))) = -34
        //((2*3)-(4*5)) = -14
        //((2*(3-4))*5) = -10
        //(2*((3-4)*5)) = -10
        //(((2*3)-4)*5) = 10
        assertEquals(diffWaysToCompute("2*3-4*5"), asList(-34,-14,-10,-10,10));
    }

    @Test
    public void should_give_correct_output3() {
        //((2*(3-(4*5))+7)) = -27
        //((2*((3-4)*5))+7) = -3
        //(((2*3)-(4*5))+7) = -7
        //(((2*(3-4))*5)+7) = -3
        //((((2*3)-4)*5)+7) = 17
        //(2*((3-(4*5))+7)) =
        //(2*(3-((4*5)))
        assertEquals(diffWaysToCompute("2*3-4*5+7"), asList(-34,-14,-10,-10,10));
    }

    @Test
    public void should_give_correct_output4() {
        // ((2+1)*3)
        // (2 +(1*3))
        assertEquals(diffWaysToCompute("2+1*3"), asList(9,5));
    }
}