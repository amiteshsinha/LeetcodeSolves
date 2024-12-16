package com.leetcode.findScoreOfArrayAfterMarking;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime
 * 121
 * ms
 * Beats
 * 61.27%
 *
 * Memory
 * 81.88
 * MB
 * Beats
 * 5.09%
 * This file was created on 13/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class FindScoreOfArrayAfterMarkingElementsIter1 extends AbstractParent {

    @Override
    public long findScore(int[] nums) {
        long score = 0;
        boolean[] markedArr = new boolean[nums.length];
        List<Integer>[] valIndexList = new List[1000001];
        int max = 0;
        List<Integer> temp;
        for (int i = 0; i < nums.length; i++) {
            temp = valIndexList[nums[i]] != null ? valIndexList[nums[i]] : new ArrayList<>();
            temp.add(i);
            valIndexList[nums[i]] = temp;
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 1; i <= max; i++) {
            if (valIndexList[i] != null) {
                temp = valIndexList[i];
                for (int j : temp) {
                    if (!markedArr[j]) {
                        score += i;
                        markedArr[j] = true;
                        if (j > 0) {
                            markedArr[j - 1] = true;
                        }
                        if (j < nums.length - 1) {
                            markedArr[j + 1] = true;
                        }
                    }
                }
            }
        }
        return score;
    }

}
