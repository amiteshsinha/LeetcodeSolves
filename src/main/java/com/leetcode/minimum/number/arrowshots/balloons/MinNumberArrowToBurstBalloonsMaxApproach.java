package com.leetcode.minimum.number.arrowshots.balloons;

import java.util.Arrays;

public class MinNumberArrowToBurstBalloonsMaxApproach extends AbstractParent {

    /**
     * greedy approach
     * count the number of overlaps with decreasing sizes
     * This is distilled from the stack approach where we are counting areas with no overlaps
     * instead of calculating areas with overlaps.
     * @param points
     * @return
     */
    @Override
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[1] > b[1] ? 1 : -1);
        int arrows = 1;
        int prevEnd = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > prevEnd) {
                arrows++;
                prevEnd = points[i][1];
            } else {
                prevEnd = Math.min(prevEnd, points[i][1]);
            }
        }
        return arrows;
    }
}
