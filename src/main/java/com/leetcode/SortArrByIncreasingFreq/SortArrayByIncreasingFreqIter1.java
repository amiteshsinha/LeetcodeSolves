package com.leetcode.SortArrByIncreasingFreq;

import java.util.Stack;

public class SortArrayByIncreasingFreqIter1 extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 96.85%
     * Analyze Complexity
     * Memory
     * 44.34
     * MB
     * Beats
     * 68.44%
     * @param nums
     * @return
     */
    @Override
    public int[] frequencySort(int[] nums) {
        int[] sortArr = new int[201];
        int maxFreq = 0, temp;
        for (int i : nums) {
            temp = i + 100;
            sortArr[temp]++;
            if (sortArr[temp] > maxFreq) {
                maxFreq++;
            }
        }
        // stack since for the same frequency we have to return in decreasing order
        Stack<Integer>[] maxFreqArr = new Stack[maxFreq + 1];
        for (int i = 0; i < sortArr.length; i++) {
            if (maxFreqArr[sortArr[i]] == null) {
                maxFreqArr[sortArr[i]] = new Stack<>();
            }
            maxFreqArr[sortArr[i]].push(i);
        }
        int j = 0;
        for (int i = 1; i < maxFreqArr.length; i++) {
            if (maxFreqArr[i] != null) {
                while (!maxFreqArr[i].isEmpty()) {
                    temp = maxFreqArr[i].pop() - 100;
                    for (int k = 0; k < i; k++) {
                        nums[j] = temp;
                        j++;
                    }
                }
            }
        }
        return nums;
    }
}
