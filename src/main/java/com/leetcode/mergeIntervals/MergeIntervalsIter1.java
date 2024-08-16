package com.leetcode.mergeIntervals;

import java.util.LinkedList;

public class MergeIntervalsIter1 extends AbstractParent {

    /**
     * @param intervals
     * @return
     */
    @Override
    public int[][] merge(int[][] intervals) {
        int max = -1, min = 1000000, start = 0, end = 0;
        for (int i = 0; i < intervals.length; i++) {
            // get the 1st value of each
            max = Math.max(intervals[i][0], max);
            min = Math.min(intervals[i][0], min);
        }
        int[] periodArr = new int[max - min + 1];
        for (int i = 0; i < intervals.length; i++) {
            // max of the end value and its current value because there can be multiple
            // values for the same start so we take max start
            periodArr[intervals[i][0] - min] = Math.max(intervals[i][1] - min, periodArr[intervals[i][0] - min]);
        }
        LinkedList<int[]> retVal = new LinkedList<>();
        for (int i = 0; i < periodArr.length; i++) {
            if (periodArr[i] != 0) {
                if (i <= end) {
                    end = Math.max(periodArr[i], end);
                } else {
                    // whenever we hit the next non-zero integer the current range gets added
                    retVal.add(new int[]{start + min, end + min});
                    start = i;
                    end = periodArr[i];
                }
            }
        }
        retVal.add(new int[]{start + min, end + min});
        return retVal.toArray(new int[retVal.size()][]);
    }
}
