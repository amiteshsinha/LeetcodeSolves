package com.leetcode.solveTheEquation;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SolveTheEquation
 * 09/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public static final String INFINITE_SOLUTIONS = "Infinite solutions";
    public static final String NO_SOLUTION = "No solution";

    public abstract String solveEquation(String equation);

    @Test
    public void should_give_correct_output1() {
        assertEquals(solveEquation("x+5-3+x=6+x-2"), "x=2");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(solveEquation("x=x"), INFINITE_SOLUTIONS);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(solveEquation("2x=x"), "x=0");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(solveEquation("x=x+2"), NO_SOLUTION);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(solveEquation("3x=33+22+11"), "x=22");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(solveEquation("12x+0=x+33+22+11"), "x=6");
    }
}