package com.leetcode.validSudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku extends AbstractValidSudoku {

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
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char checkChar = row[i];
            if (checkChar != '.' && charSet.contains(checkChar)) {
                return false;
            } else {
                charSet.add(checkChar);
            }
        }
        return true;
    }

    public boolean isValidCol(char[][] row, int col) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char checkChar = row[i][col];
            if (checkChar != '.' && charSet.contains(checkChar)) {
                return false;
            } else {
                charSet.add(checkChar);
            }
        }
        return true;
    }

    public boolean isValidGrid(char[][] row, int rowStart, int colStart) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char checkChar = row[rowStart + i][colStart + j];
                if (checkChar != '.' && charSet.contains(checkChar)) {
                    return false;
                } else {
                    charSet.add(checkChar);
                }
            }
        }
        return true;
    }

}
