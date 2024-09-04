package com.leetcode.walkingRobotSimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalkingRobotSimulation extends AbstractParent {

    /**
     * Runtime
     * 18
     * ms
     * Beats
     * 70.31%
     * Analyze Complexity
     * Memory
     * 49.42
     * MB
     * Beats
     * 54.15%
     */

    //-2: Turn left 90 degrees.
    //-1: Turn right 90 degrees.
    //1 <= k <= 9: Move forward k units, one unit at a time.

    String currDir = "+Y";
    @Override
    public int robotSim(int[] commands, int[][] obstacles) {
        int retVal = 0, currX = 0, tempX, currY = 0, tempY, currDist;
        Map<Integer, List<int[]>> xObstacleListMap = new HashMap<>();
        Map<Integer, List<int[]>> yObstacleListMap = new HashMap<>();
        for (int[] obstaclePos : obstacles) {
            xObstacleListMap.computeIfAbsent(obstaclePos[0], k -> new ArrayList<>()).add(obstaclePos);
            yObstacleListMap.computeIfAbsent(obstaclePos[1], k -> new ArrayList<>()).add(obstaclePos);
        }
        for (int i : commands) {
            if (i == -2 || i == -1) {
                changeCurrDir(i);
            } else {
                tempX = currX;
                tempY = currY;
                if (currDir == "+Y") {
                    tempY += i;
                } else if (currDir == "-Y") {
                    tempY -= i;
                } else if (currDir == "+X") {
                    tempX += i;
                } else if (currDir == "-X") {
                    tempX -= i;
                }
                if ((currDir == "+X" || currDir == "-X") && yObstacleListMap.containsKey(currY)) {
                    tempX = findObstacleVal(currX, tempX, yObstacleListMap.get(currY), true);
                } else if ((currDir == "+Y" || currDir == "-Y") && xObstacleListMap.containsKey(currX)) {
                    tempY = findObstacleVal(currY, tempY, xObstacleListMap.get(currX), false);
                }
                currX = tempX;
                currY = tempY;
                currDist = currX*currX + currY*currY;
                if (currDist > retVal) {
                    retVal = currDist;
                }
            }
        }
        return retVal;
    }

    private int findObstacleVal(int start, int end, List<int[]> obstacleList, boolean isXDir) {
        if (obstacleList != null) {
            for (int[] obstacle : obstacleList) {
                int obst = isXDir ? obstacle[0] : obstacle[1];
                if (obst > start && obst <= end) {
                    return obst - 1;
                } else if (obst < start && obst >= end) {
                    return obst + 1;
                }
            }
        }
        return end;
    }


    private void changeCurrDir(int i) {
        if (currDir == "+Y") {
            currDir = i == -2 ? "-X" : "+X";
        } else if (currDir == "-Y") {
            currDir = i == -2 ? "+X" : "-X";
        }else if (currDir == "+X") {
            currDir = i == -2 ? "+Y" : "-Y";
        } else {
            currDir = i == -2 ? "-Y" : "+Y";
        }
    }
}
