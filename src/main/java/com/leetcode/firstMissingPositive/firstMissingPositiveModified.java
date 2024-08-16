package com.leetcode.firstMissingPositive;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class firstMissingPositiveModified extends AbstractFirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int i = 1;
        while (i <= nums.length) {
            if (set.contains(i)) {
                i++;
            } else {
                return i;
            }
        }
        return i;
    }
}
