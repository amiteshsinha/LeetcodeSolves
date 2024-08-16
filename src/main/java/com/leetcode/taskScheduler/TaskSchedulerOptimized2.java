package com.leetcode.taskScheduler;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TaskSchedulerOptimized2 extends AbstractParent {

    @Override
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Entry<Character, Integer>> freqCount = map.entrySet().stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

        //max is first with decreasing number of frequency
        // cover all non-unique items then add number of unique items to remaining space
        int intervals = (freqCount.get(0).getValue() - 1)*n;
        int retCount = intervals + freqCount.get(0).getValue();
        int maxFreq = freqCount.get(0).getValue();
        for(int ref = 1; ref < freqCount.size(); ref++) {
            int currentFreq = freqCount.get(ref).getValue();
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
        }
        return retCount;
    }
}
