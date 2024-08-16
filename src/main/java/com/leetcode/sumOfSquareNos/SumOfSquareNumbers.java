package com.leetcode.sumOfSquareNos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfSquareNumbers extends AbstractParent {


    /**
     * Runtime
     * 68
     * ms
     * Beats
     * 5.11%
     *
     * Memory
     * 55.49
     * MB
     * Beats
     * 5.18%
     * @param c
     * @return
     */
    @Override
    public boolean judgeSquareSum(int c) {
        int temp;
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> squareSet = new HashSet<>();
        for (int i = 0; (temp = i*i) <= c; i++) {
            integerList.add(temp);
            squareSet.add(temp);
        }
        int k = Collections.binarySearch(integerList, c);
        if (k >= 0) {
            // number is sum of 0square and its square root square
            System.out.println(c +" is a square");
            return true;
        } else {
            k = integerList.size() - 1;
        }
        for (int i = k; i >= 0; i--) {
            temp = c - integerList.get(i);
            if (squareSet.contains(temp)) {
                System.out.println(c +" can be formed by the following squares : " + temp + " and " + integerList.get(i));
                return true;
            }
        }
        return false;
    }
}
