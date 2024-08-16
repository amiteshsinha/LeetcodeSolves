package com.leetcode.combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 extends AbstractParent {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> currentList = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        combinationSumRecursive(result, currentList, candidates, target, 0);
        return new ArrayList<>(result);
    }

    private void combinationSumRecursive(Set<List<Integer>> result, List<Integer> currentList, int[] currentSet, int target, int cursor) {
        if (target == 0) {
            result.add(currentList);
            return;
        } else {
            for (int j = cursor; j <currentSet.length; j++) {
                int integer = currentSet[j];
                List<Integer> arrayList = new ArrayList<>(currentList);
                if (target - integer >= 0) {
                    target = target - integer;
                    currentList.add(integer);
                    combinationSumRecursive(result, currentList, currentSet, target, j + 1);
                    target = target + integer;
                    currentList = arrayList;
                }
            }
        }
    }

}
