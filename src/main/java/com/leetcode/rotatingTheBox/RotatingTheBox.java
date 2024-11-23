package com.leetcode.rotatingTheBox;

import java.util.Arrays;

/**
 * Runtime
 * 13
 * ms
 * Beats
 * 36.18%
 *
 * Memory
 * 79.35
 * MB
 * Beats
 * 70.19%
 *
 * This file was created on 23/11/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public class RotatingTheBox extends AbstractParent {

    static char BLOCK = '*';
    static char STONE = '#';
    static char SPACE = '.';
    @Override
    public char[][] rotateTheBox(char[][] box) {
        // step 1 - create the rotated empty array
        char[][] rotatedBox = new char[box[0].length][box.length];
        // step 1a - fill the rotated box with spaces
        for (char[] arr : rotatedBox) {
            Arrays.fill(arr, SPACE);
        }
        // step 2 - place the blocks (stationary objects) first
        placeBlocks(box, rotatedBox);
        // step 3 - for any row in original box - count number of stones till the end or a block is reached
        // step 4 - move the stones to column starting with the block then repeat step 3
        int j, stoneCount;
        for (int i = 0; i < box.length; i++) {
            stoneCount = 0;
            for (j = 0; j < box[0].length; j++) {
                if (box[i][j] == BLOCK && stoneCount > 0) {
                    putStonesOverTheBlock(rotatedBox, stoneCount, j, i);
                    stoneCount = 0;
                }
                if (box[i][j] == STONE) {
                    stoneCount++;
                }
            }
            putStonesOverTheBlock(rotatedBox, stoneCount, j, i);
        }
        return rotatedBox;
    }

    private void putStonesOverTheBlock(char[][] rotatedBox, int stoneCount, int j, int i) {
        for (int start = j - 1; start >= 0 && stoneCount > 0; start--) {
            rotatedBox[start][rotatedBox[0].length - 1 - i] = STONE;
            stoneCount--;
        }
    }

    private void placeBlocks(char[][] box, char[][] rotatedBox) {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] == BLOCK) {
                    rotatedBox[j][box.length - 1 - i] = BLOCK;
                }
            }
        }
    }

}
