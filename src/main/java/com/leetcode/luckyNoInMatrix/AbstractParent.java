package com.leetcode.luckyNoInMatrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * LuckyNoInMatrix
 * 19/07/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> luckyNumbers(int[][] matrix);

    @Test
    public void should_give_correct_output1() {
        assertEquals(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}), Arrays.asList(15));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}), Arrays.asList(12));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(luckyNumbers(new int[][]{{7,8},{1,2}}), Arrays.asList(7));
    }
}