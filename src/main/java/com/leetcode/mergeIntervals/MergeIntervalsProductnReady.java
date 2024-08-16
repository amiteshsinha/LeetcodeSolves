package com.leetcode.mergeIntervals;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class MergeIntervalsProductnReady extends AbstractParent {

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
        List<Interval> intervalList = new ArrayList<>();
        for (int[] arr : intervals) {
            intervalList.add(new Interval(arr[0], arr[1]));
        }
        intervalList.sort(Comparator.comparing(Interval::getStart).thenComparing(Interval::getEnd));
        Deque<Interval> deque = new ArrayDeque<>();
        for (Interval currInterval : intervalList) {
            if (!deque.isEmpty() && currInterval.start <= deque.peekLast().end) {
                Interval present = deque.pollLast();
                present.end = currInterval.end > present.end ? currInterval.end : present.end;
                deque.offer(present);
            } else {
                deque.offer(currInterval);
            }
        }
        // code for returning values in int[][] array format
        int[][] retArr = new int[deque.size()][2];
        int counter = 0;
        while (!deque.isEmpty()) {
            Interval currInterval = deque.pollFirst();
            retArr[counter++] = new int[]{currInterval.start, currInterval.end};
        }
        return retArr;
    }

    class Interval {
        int start;
        int end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
