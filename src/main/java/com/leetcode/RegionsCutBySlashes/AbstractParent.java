package com.leetcode.RegionsCutBySlashes;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * RegionsCutBySlashes
 * 10/08/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int regionsBySlashes(String[] grid);

    @Test
    public void should_give_correct_output1() {
        assertEquals(regionsBySlashes(new String[]{" /","/ "}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(regionsBySlashes(new String[]{" /","  "}), 1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(regionsBySlashes(new String[]{"/\\","\\/"}), 5);
    }
}