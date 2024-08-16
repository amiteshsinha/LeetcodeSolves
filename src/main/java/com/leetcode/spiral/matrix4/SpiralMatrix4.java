package com.leetcode.spiral.matrix4;

public class SpiralMatrix4 extends AbstractParent {

//    private Function<ListNode, Integer> getNextVal = (node) -> {
//      int val = node != null ? node.val : -1;
//      return val;
//    };

    @Override
    public int[][] spiralMatrix(int colSize,int rowSize, ListNode head) {
        int[][] matrix = new int[colSize][rowSize];
        for (int m = 0; m < colSize; m++) {
            for (int n = 0; n < rowSize; n++) {
                matrix[m][n] = -1;
            }
        }

        int i = 0, j = 0;
        int colMid= colSize/2 + 1, rowMid = rowSize/2 + 1;

        for (; i < colMid && j < rowMid && head != null; i++, j++) {
            for (int a = j; a < rowSize - 1 - j && matrix[i][a] == -1 && head != null; a++) {
                matrix[i][a] = head.val;
                head = head.next;
            }
            for (int b = i; b < colSize - 1 - i && matrix[b][rowSize - 1 -j] == -1 && head != null; b++) {
                matrix[b][rowSize - 1 -j] = head.val;
                head = head.next ;
            }
            for (int c = rowSize - 1 - j; c > j && matrix[colSize - 1 - i][c] == -1 && head != null; c--) {
                matrix[colSize - 1 - i][c] = head.val;
                head = head.next;
            }
            for (int d = colSize - 1 - i; d > i && matrix[d][j] == -1 && head != null; d--) {
                matrix[d][j] = head.val;
                head = head.next;
            }
        }
        if (colSize % 2 != 0 && rowSize % 2 != 0 && colSize == rowSize && head != null) {
            matrix[colSize/2][rowSize/2] = head.val;
        }
        return matrix;
    }
}
