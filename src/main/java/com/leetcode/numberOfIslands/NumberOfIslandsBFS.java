package com.leetcode.numberOfIslands;

public class NumberOfIslandsBFS extends AbstractParent {

    int ROW = 0;
    int COL = 0;

    @Override
    public int numIslands(char[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        int count = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == '1') {
                    BFSVisitIsland(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    private void BFSVisitIsland(int row, int col, char[][] grid) {
        grid[row][col] = '*';
        if (row > 0 && grid[row - 1][col] == '1') {
            BFSVisitIsland(row - 1, col, grid);
        }
        if (row + 1 < ROW && grid[row + 1][col] == '1') {
            BFSVisitIsland(row + 1, col, grid);
        }
        if (col > 0 && grid[row][col - 1] == '1') {
            BFSVisitIsland(row, col - 1, grid);
        }
        if (col + 1 < COL && grid[row][col + 1] == '1') {
            BFSVisitIsland(row, col + 1, grid);
        }
    }


}
