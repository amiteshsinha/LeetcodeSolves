package com.leetcode.numberOfIslands;

public class NumberOfIslandsDFS extends AbstractParent {

    int row = 0;
    int col = 0;
    int[] rowArr = {-1, 0, 1, 0};
    int[] colArr = {0, 1, 0, -1};

    @Override
    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        boolean[][] visitedIsland = new boolean[row][col];
        int count = 0;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                if (grid[i][j] == '1' && !visitedIsland[i][j]) {
                    DFSVisitIsland(i, j, grid, visitedIsland);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFSVisitIsland(int row, int col, char[][] grid, boolean[][] visitedIsland) {
        visitedIsland[row][col] = true;
        for (int i = 0; i < 4; i++) {
            if (isSafe(grid, row + rowArr[i], col + colArr[i]) && !visitedIsland[row + rowArr[i]][col + colArr[i]]) {
                // only visit island if its safe
                DFSVisitIsland(row + rowArr[i], col + colArr[i], grid, visitedIsland);
            }
        }
    }

    private boolean isSafe(char[][] grid, int currRow, int currCol) {
        return (currRow >= 0 && currRow < row && currCol >= 0 && currCol < col && grid[currRow][currCol] == '1') ? true : false;
    }


}
