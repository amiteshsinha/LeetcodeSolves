package com.leetcode.pascal.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle extends AbstractParent {

    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retList = new ArrayList<>();
        List<Integer> prevList = Arrays.asList(1);
        retList.add(prevList);
        // for each row create a new list
        for (int i = 1 ; i < numRows; i++) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            for (int j = 1; j < i; j++) {
                currList.add(prevList.get(j - 1) + prevList.get(j));
            }
            currList.add(1);
            retList.add(currList);
            // switch prev and current lists
            prevList = currList;
        }
        return retList;
    }
}
