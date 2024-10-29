package com.leetcode.maxNoOfMovesInGrid;

import com.amitesh.core.baseclass.GenericPrinter;

/**
 * This file was created on 29/10/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class MaxNoOfMovesInGrid extends AbstractParent {

    @Override
    public int maxMoves(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxMove = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxMove = Math.max(maxMove, maxMoveAt(grid, i, j, visited));
            }
        }
        return maxMove;
    }

    private int maxMoveAt(int[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        //(row - 1, col + 1) upR diagonal, (row, col + 1) right and (row + 1, col + 1) downR diagonal
        int upRDiagonal = 0, right = 0, downRDiagonal = 0;
        if (i > 0 && j < grid[0].length - 1 && grid[i - 1][j + 1] > grid[i][j]) {
            upRDiagonal = maxMoveAt(grid, i - 1, j + 1, visited);
        }
        if (j < grid[0].length - 1 && grid[i][j + 1] > grid[i][j]) {
            right = maxMoveAt(grid, i, j + 1, visited);
        }
        if (i < grid.length - 1 && j < grid[0].length - 1 && grid[i + 1][j + 1] > grid[i][j]) {
            downRDiagonal = maxMoveAt(grid, i - 1, j + 1, visited);
        }
        visited[i][j] = false;
        return 1 + Math.max(upRDiagonal, Math.max(downRDiagonal, right));
    }

}
