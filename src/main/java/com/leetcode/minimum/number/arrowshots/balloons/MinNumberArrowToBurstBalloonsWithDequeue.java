package com.leetcode.minimum.number.arrowshots.balloons;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinNumberArrowToBurstBalloonsWithDequeue extends AbstractParent {

    /**
     * greedy approach
     * @param points
     * @return
     */
    @Override
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[1] > b[1] ? 1 : -1);
        Deque<int[]> pointsStack = new ArrayDeque<>();
        pointsStack.offerLast(points[0]);
        for (int i = 1; i < points.length; i++) {
            int currentStart = points[i][0], currentEnd = points[i][1];
            while (!pointsStack.isEmpty() && currentStart <= pointsStack.peekLast()[1]) {
                int[] point = pointsStack.pollLast();
                currentStart = Math.max(point[0], currentStart);
                currentEnd = Math.min(point[1], currentEnd);
            }
            pointsStack.offerLast(new int[]{currentStart, currentEnd});
        }
        return pointsStack.size();
    }
}
