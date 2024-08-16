package com.leetcode.mergeIntervals;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MergeIntervals extends AbstractParent {

    /**
     * Runtime
     * 8
     * ms
     * Beats
     * 85.67%
     * Memory
     * 46.02
     * MB
     * Beats
     * 91.59%
     * @param intervals
     * @return
     */
    @Override
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        Deque<int[]> deque = new ArrayDeque<>();
        int[] temp;
        for (int i = 0; i < intervals.length; i++) {
            temp = intervals[i];
            if (!deque.isEmpty() && temp[0] <= deque.peekLast()[1]) {
                int[] present = deque.pollLast();
                present[1] = present[1] >= temp[1] ? present[1] : temp[1];
                deque.offer(present);
            } else {
                deque.offer(temp);
            }
        }
        int[][] retArr = new int[deque.size()][2];
        int counter = 0;
        while (!deque.isEmpty()) {
           retArr[counter] = deque.pollFirst();
           counter++;
        }
        return retArr;
    }
}
