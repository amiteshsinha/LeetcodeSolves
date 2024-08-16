package com.leetcode.combinationSum2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractParent {

    public abstract List<List<Integer>> combinationSum2(int[] candidates, int target);

    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,1,6));
        result.add(Arrays.asList(1,2,5));
        result.add(Arrays.asList(1,7));
        result.add(Arrays.asList(2,6));
        assert combinationSum2(new int[]{10,1,2,7,6,1,5}, 8).containsAll(result);
    }

    @Test
    public void test2() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,2,2));
        result.add(Arrays.asList(5));
        assert combinationSum2(new int[]{2,5,2,1,2}, 5).containsAll(result);
    }
}
