package com.leetcode.taskScheduler;

import java.util.Arrays;
import java.util.Collections;

public class TaskSchedulerOptimized extends AbstractParent {

    @Override
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        Integer[] freqCount = new Integer[26];
        for (int i = 0; i < freqCount.length; i++) {
            freqCount[i] = 0;
        }
        int ref = 0;
        for (char c : tasks) {
            ref = c - 'A';
            if (freqCount[ref] == 0) {
                freqCount[ref] = 1;
            } else {
                freqCount[ref] += 1;
            }
        }
        Arrays.sort(freqCount, Collections.reverseOrder());
        //max is first with decreasing number of frequency
        // cover all non-unique items then add number of unique items to remaining space
        ref = 1;
        int intervals = (freqCount[0] - 1)*n;
        int retCount = intervals + freqCount[0];
        int maxFreq = freqCount[0];
        while (ref < 26 && freqCount[ref] != 0) {
            int currentFreq = freqCount[ref];
            //for filling up single items in spaces
            if (currentFreq == 1) {
                if (intervals > 0) {
                    // fill in the gaps
                    intervals--;
                } else {
                    // add to the end
                    retCount++;
                }
            } else if (currentFreq == maxFreq) {
                if (intervals == 0 && retCount > currentFreq*n) {
                    retCount += currentFreq;
                } else {
                    if (currentFreq > intervals + 1) {
                        // increase number of intervals by n
                        intervals += n;
                        retCount += n - 1;
                    }
                    intervals = intervals + 1 - currentFreq;
                    retCount += 1;
                }
            } else {
                // freq is less than max freq but greater than 1
                if (intervals > currentFreq) {
                    intervals -= currentFreq;
                } else {
                    retCount = retCount + currentFreq - intervals;
                    intervals = 0;
                }
            }
            ref++;
        }
        return retCount;
    }
}
