package com.leetcode.mostVisitedInCircularTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 42.48
 * MB
 * Beats
 * 99.49%
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class MostVisitedSectorInCircularTrackIter1 extends AbstractParent {

    @Override
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> retList = new ArrayList<>();
        // all we need to do is look at start and end.
        int start = rounds[0];
        int end = rounds[rounds.length - 1];

        // if start is less than end, then we can directly add all numbers from start to end. This is because
        // the track is circular and all sectors will be visited the same number of times after end and before the start
        // For eg - if n = 4, start = 1, end = 2 - no matter what came in the middle - they all will have the same
        // number of visits except for sectors 1 and 2 which will have 1 more than the rest
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                retList.add(i);
            }
        } else { // if start is greater than end, then we add all numbers from start to n and then from 1 to end
            // the response needs to be sent in ascending order so 1st add 1 - end then from start to n
            for (int i = 1; i <= end; i++) {
                retList.add(i);
            }
            for (int i = start; i <= n; i++) {
                retList.add(i);
            }
        }
        return retList;
    }

}
