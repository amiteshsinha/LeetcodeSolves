package com.leetcode.taskScheduler;

import java.util.Arrays;

public class TaskSchedulerOptimizedFinal extends AbstractParent {

    @Override
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        int[] freqCount = new int[26];
        for (char c : tasks) {
            freqCount[c - 'A'] += 1;
        }
        Arrays.sort(freqCount);

        int batchCnt = freqCount[25] - 1; // highest frequency
        int vacantSlots = batchCnt * n;

        for(int indx = 24; indx >= 0 && freqCount[indx] > 0; indx--){
            vacantSlots -= Math.min(freqCount[indx], batchCnt);
        }
        return vacantSlots > 0 ? tasks.length + vacantSlots : tasks.length;
    }
}
