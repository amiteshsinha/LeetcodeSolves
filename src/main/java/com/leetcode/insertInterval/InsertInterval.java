package com.leetcode.insertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval extends AbstractParent {

    /**
     * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
     * Output: [[1,5],[6,9]]
     * Example 2:
     *
     * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
     * Output: [[1,2],[3,10],[12,16]]
     * @param intervals
     * @param newInterval
     * @return
     */
    @Override
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || ((intervals.length == 0) || (intervals.length == 1 && intervals[0].length == 0))) {
            intervals = new int[1][];
            intervals[0] = newInterval;
            return intervals;
        }
        List<int[]> arr = new ArrayList<>();
        List<int[]> normalArr = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = intervals[i];
            if (currInterval[1] < newInterval[0] || newInterval[1] < currInterval[0]) {
                normalArr.add(currInterval);
            } else {
                arr.add(currInterval);
            }
        }
        int[] mergedArr = merge(arr, newInterval);
        int[][] retArr = new int[intervals.length - arr.size()][];
        normalArr.add(mergedArr);
        normalArr.sort((a,b) -> a[0] < b[0] ? -1 : 1);
        return normalArr.toArray(retArr);
    }

    public int[] merge(List<int[]> intervals, int[] newInterval) {
        if (intervals.isEmpty()) {
            return newInterval;
        }
        int min = Math.min(intervals.get(0)[0], newInterval[0]);
        int max = Math.max(intervals.get(intervals.size() - 1)[1], newInterval[1]);
        return new int[]{min, max};
    }

}
