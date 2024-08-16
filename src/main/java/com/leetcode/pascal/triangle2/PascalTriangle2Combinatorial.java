package com.leetcode.pascal.triangle2;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle2Combinatorial extends AbstractParent {

    public long findCombination(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) /(i + 1);
        }
        return result;
    }

    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> retList = new LinkedList<>();
        for (int i = 0; i <= rowIndex; i++) {
            retList.add((int)findCombination(rowIndex, i));
        }
        return retList;
    }
}
