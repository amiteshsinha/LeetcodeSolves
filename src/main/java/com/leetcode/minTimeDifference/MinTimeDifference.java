package com.leetcode.minTimeDifference;

import java.util.List;

public class MinTimeDifference extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 90.06%
     *
     * Memory
     * 44.51
     * MB
     * Beats
     * 98.24%
     * @param timePoints
     * @return
     */
    @Override
    public int findMinDifference(List<String> timePoints) {
        int[] timeArr = new int[1440];
        int currTime, diff, minDiff = 1440, i = 1440, j = 1440, tempi, tempj;
        for (String time : timePoints) {
            currTime = getTime(time);
            if (timeArr[currTime] != 0) {
                return 0;
            } else {
                timeArr[currTime] = 1;
                if (i > currTime) {
                    j = i;
                    i = currTime;
                } else if (j > currTime) {
                    j = currTime;
                }
            }
        }
        tempi = i;
        tempj = j;
        while (j < timeArr.length) {
            //here i and j are both 1;
            tempj = j;
            diff = j - i;
            if (diff > 720) {
                diff = 1440 - diff;
            }
            minDiff = Math.min(diff, minDiff);
            i = j;
            j++;
            while (j < timeArr.length && timeArr[j] != 1) {
                j++;
            }
        }
        diff = tempj - tempi;
        if (diff > 720) {
            diff = 1440 - diff;
        }
        minDiff = Math.min(diff, minDiff);
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
