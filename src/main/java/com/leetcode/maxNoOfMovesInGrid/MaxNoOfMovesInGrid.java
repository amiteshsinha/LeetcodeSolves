package com.leetcode.maxNoOfMovesInGrid;

//import static com.amitesh.core.baseclass.GenericPrinter.printIntGrid;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 100.00%
 * <p>
 * Memory
 * 56.18
 * MB
 * Beats
 * 67.39%
 * This file was created on 29/10/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class MaxNoOfMovesInGrid extends AbstractParent {

    @Override
    public int maxMoves(int[][] grid) {
        int maxMove = 0, j = 0;
        int[][] visited = new int[grid.length][grid[0].length];// had to add visited later because i was getting TLE
        // You can start at any cell in the first column of the matrix
        for (int i = 0; i < grid.length; i++) {
            maxMove = Math.max(maxMove, maxMoveAt(grid, i, j, visited) - 1);
        }
        //printIntGrid(visited);
        return maxMove;
    }

    private int maxMoveAt(int[][] grid, int i, int j, int[][] visited) {
        if (visited[i][j] > 0) {
            return visited[i][j];
        }
        //(row - 1, col + 1) upR diagonal, (row, col + 1) right and (row + 1, col + 1) downR diagonal
        int upRDiagonal = 0, right = 0, downRDiagonal = 0;
        if (j < grid[0].length - 1) {
            if (i > 0 && grid[i - 1][j + 1] > grid[i][j]) {
                upRDiagonal = maxMoveAt(grid, i - 1, j + 1, visited);
            }
            if (grid[i][j + 1] > grid[i][j]) {
                right = maxMoveAt(grid, i, j + 1, visited);
            }
            if (i < grid.length - 1 && grid[i + 1][j + 1] > grid[i][j]) {
                downRDiagonal = maxMoveAt(grid, i + 1, j + 1, visited);
            }
        }
        visited[i][j] = 1 + Math.max(upRDiagonal, Math.max(downRDiagonal, right));
        return visited[i][j];
    }

}
