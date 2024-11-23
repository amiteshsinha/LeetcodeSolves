package com.leetcode.rotatingTheBox;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * RotatingTheBox
 * <p>
 * <p>
 * This file was created on 23/11/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract char[][] rotateTheBox(char[][] box);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(rotateTheBox(new char[][]{{'#', '.', '#'}}),
                new char[][]{
                        {'.'},
                        {'#'},
                        {'#'}});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(rotateTheBox(new char[][]{
                        {'#', '.', '*', '.'},
                        {'#', '#', '*', '.'}}),
                new char[][]{
                        {'#', '.'},
                        {'#', '#'},
                        {'*', '*'},
                        {'.', '.'}});
    }


    @Test
    public void should_give_correct_output_3() {
        assertEquals(rotateTheBox(new char[][]{
                        {'#', '#', '*', '.', '*', '.'},
                        {'#', '#', '#', '*', '.', '.'},
                        {'#', '#', '#', '.', '#', '.'}}),
                new char[][]{
                        {'.', '#', '#'},
                        {'.', '#', '#'},
                        {'#', '#', '*'},
                        {'#', '*', '.'},
                        {'#', '.', '*'},
                        {'#', '.', '.'}});
    }
}
