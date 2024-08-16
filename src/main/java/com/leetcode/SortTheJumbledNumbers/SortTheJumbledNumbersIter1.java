package com.leetcode.SortTheJumbledNumbers;

import java.util.ArrayList;
import java.util.List;

public class SortTheJumbledNumbersIter1 extends AbstractParent {

    /**
     * Runtime
     * 79
     * ms
     * Beats
     * 93.69%
     *
     * Memory
     * 55.34
     * MB
     * Beats
     * 72.07%
     * @param mapping
     * @param nums
     * @return
     */
    @Override
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<NumberMapper> list = new ArrayList<>();
        int max = 0;
        for (int i : nums) {
            NumberMapper num = new NumberMapper(i, computeNumber(mapping, i));
            list.add(num);
            if (num.jumbledNum > max) {
                max = num.jumbledNum;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i).arrayNum;
        }
        return nums;
    }

    private int computeNumber(int[] mapping, int i) {
        if (i == 0) {
            return mapping[0];
        }
        int temp = 0, retVal = 0, multiplier = 1;
        while (i > 0) {
            temp = i % 10;
            retVal += mapping[temp]*multiplier;
            multiplier *= 10;
            i = i/10;
        }
        return retVal;
    }

    class NumberMapper {
        int arrayNum;
        int jumbledNum;
        NumberMapper(int i, int j) {
            arrayNum = i;
            jumbledNum = j;
        }
    }
}
