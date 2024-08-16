package com.leetcode.minimum.number.arrowshots.balloons;

import java.util.Arrays;
import java.util.Stack;

public class MinNumberArrowToBurstBalloons extends AbstractParent {

    /**
     * greedy approach
     * count the number of overlaps with decreasing sizes
     * @param points
     * @return
     */
    @Override
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[1] > b[1] ? 1 : -1);
        Stack<int[]> pointsStack = new Stack<>();
        pointsStack.push(points[0]);
        for (int i = 1; i < points.length; i++) {
            int currentStart = points[i][0], currentEnd = points[i][1];
            while (!pointsStack.isEmpty() && currentStart <= pointsStack.peek()[1]) {
                int[] point = pointsStack.pop();
                currentStart = Math.max(point[0], currentStart);
                currentEnd = Math.min(point[1], currentEnd);
            }
            pointsStack.push(new int[]{currentStart, currentEnd});
        }
        return pointsStack.size();
    }
}
