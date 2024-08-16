package com.leetcode.maxAreaOfIsland;

public class MaxAreaOfIsland extends AbstractParent {

    int ROW = 0;
    int COL = 0;
    @Override
    public int maxAreaOfIsland(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(BFSVisitIsland(i, j, grid), maxArea);
                }
            }
        }
        return maxArea;
    }

    private int BFSVisitIsland(int row, int col, int[][] grid) {
        grid[row][col] = 0;
        int retVal = 1;
        if (row > 0 && grid[row - 1][col] == 1) {
            retVal += BFSVisitIsland(row - 1, col, grid);
        }
        if (row + 1 < ROW && grid[row + 1][col] == 1) {
            retVal += BFSVisitIsland(row + 1, col, grid);
        }
        if (col > 0 && grid[row][col - 1] == 1) {
            retVal += BFSVisitIsland(row, col - 1, grid);
        }
        if (col + 1 < COL && grid[row][col + 1] == 1) {
            retVal += BFSVisitIsland(row, col + 1, grid);
        }
        return retVal;
    }
}
