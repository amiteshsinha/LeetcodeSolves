package com.leetcode.validSudoku;

import org.junit.jupiter.api.Test;

public class ValidSudoku2 extends AbstractValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            System.out.println((i / 3) * 3 + " " + (i % 3) * 3);
            if (isValidRow(board[i]) && isValidCol(board, i) && isValidGrid(board,
                    (i / 3) * 3, (i % 3) * 3)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isValidRow(char[] row) {
        char[] arr = new char[9];
        char ref = '1';
        for (int i = 0; i < 9; i++) {
            char checkChar = row[i];
            if (checkChar == '.') {
                continue;
            }
            if( arr[checkChar - ref] != 0) {
                return false;
            } else {
                arr[checkChar - ref] = checkChar;
            }
        }
        return true;
    }

    public boolean isValidCol(char[][] row, int col) {
        char[] arr = new char[9];
        char ref = '1';
        for (int i = 0; i < 9; i++) {
            char checkChar = row[i][col];
            if (checkChar == '.') {
                continue;
            }
            if( arr[checkChar - ref] != 0) {
                return false;
            } else {
                arr[checkChar - ref] = checkChar;
            }
        }
        return true;
    }

    public boolean isValidGrid(char[][] row, int rowStart, int colStart) {
        char[] arr = new char[9];
        char ref = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char checkChar = row[rowStart + i][colStart + j];
                if (checkChar == '.') {
                    continue;
                }
                if( arr[checkChar - ref] != 0) {
                    return false;
                } else {
                    arr[checkChar - ref] = checkChar;
                }
            }
        }
        return true;
    }



}
