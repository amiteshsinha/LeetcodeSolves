package com.leetcode.islandPerimeter;

public class IslandPerimeter extends AbstractParent {

    @Override
    public int islandPerimeter(int[][] grid) {
        int output = 0;
        int ROW = grid.length;
        int COL = grid[0].length;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1) {
                    output += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        output--;
                    }
                    if (i + 1 < ROW && grid[i + 1][j] == 1) {
                        output--;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        output--;
                    }
                    if (j + 1 < COL && grid[i][j + 1] == 1) {
                        output--;
                    }
                }
            }
        }
        return output;
    }
}
