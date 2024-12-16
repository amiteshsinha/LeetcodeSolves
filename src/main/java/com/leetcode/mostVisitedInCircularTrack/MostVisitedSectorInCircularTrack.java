package com.leetcode.mostVisitedInCircularTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Runtime
 * 2
 * ms
 * Beats
 * 29.95%
 *
 * Memory
 * 42.50
 * MB
 * Beats
 * 99.49%
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class MostVisitedSectorInCircularTrack extends AbstractParent {

    @Override
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] visited = new int[n + 1];
        int max = 1;
        int start = rounds[0], end, i = 1;
        visited[start]++;
        List<Integer> retList = new ArrayList<>();
        for (;i < rounds.length; i++) {
            start = rounds[i - 1];
            end = rounds[i];
            do {
                start += 1;
                if (start > n) {
                    start = 1;
                }
                visited[start]++;
                if (visited[start] > max) {
                    max = visited[start];
                }
            } while (start != end);
        }
        for (i = 1; i <= n; i++) {
            if (visited[i] == max) {
                retList.add(i);
            }
        }
        return retList;
    }

}
