package com.leetcode.minTimeDifference;

import java.util.List;

public class MinTimeDifferenceIter1 extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 45.26
     * MB
     * Beats
     * 71.57%
     * @param timePoints
     * @return
     */
    @Override
    public int findMinDifference(List<String> timePoints) {
        boolean[] timeArr = new boolean[1440];
        int currTime, minDiff = 1440, i, j = 1440, first = 1440;
        for (String time : timePoints) {
            currTime = getTime(time);
            if (timeArr[currTime]) {
                return 0;
            } else {
                timeArr[currTime] = true;
            }
        }

        for (i = 0; i < timeArr.length;i++) {
            if (timeArr[i]) {
                if (first == 1440) {
                    first = i;
                } else {
                    minDiff = Math.min(minDiff, i - j);
                }
                j = i;
            }
        }
        minDiff = Math.min(minDiff, 1440 - j + first);
        return minDiff;
    }

    //faster than parseInt - reduces time to 2 ms
    private int getTime(String time) {
        //String[] hourMin = time.split(":");
        //return Integer.parseInt(hourMin[0]) * 60 + Integer.parseInt(hourMin[1]);
        return ((time.charAt(0) - '0') * 10 + (time.charAt(1) - '0')) * 60
                + (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }
}
