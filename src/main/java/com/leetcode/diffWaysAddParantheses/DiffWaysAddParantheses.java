package com.leetcode.diffWaysAddParantheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffWaysAddParantheses extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.68%
     *
     * Memory
     * 42.66
     * MB
     * Beats
     * 45.56%
     * @param expression
     * @return
     */
    @Override
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> retList = new ArrayList<>();
        if (expression.length() >= 1 && expression.length() < 3) {
            retList.add(Integer.parseInt(expression));
            return retList;
        } else {
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                    continue;
                }
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int x : left) {
                    for (int y : right) {
                        if (expression.charAt(i) == '+') {
                            retList.add(x + y);
                        } else if (expression.charAt(i) == '*') {
                            retList.add(x * y);
                        } else if (expression.charAt(i) == '-') {
                            retList.add(x - y);
                        }
                    }
                }
            }
            return retList;
        }
    }
}
