package com.leetcode.robotCollisions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class RobotCollisions extends AbstractParent {

    /**
     * Runtime
     * 77
     * ms
     * Beats
     * 21.25%
     *
     * Memory
     * 71.58
     * MB
     * Beats
     * 10.00%
     * @param positions
     * @param healths
     * @param directions
     * @return
     */
    // the positions maybe unsorted - so iteration 0 - sort them
    @Override
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> retList = new LinkedList<>();
        Stack<Robot> robotStack = new Stack<>();
        List<Robot> robotPosList = new ArrayList<>();
        Map<Integer, Robot> robotPosMap = new HashMap<>();
        for (int i = 0; i < healths.length; i++) {
         Robot robot = new Robot(positions[i], healths[i], directions.charAt(i));
            robotPosList.add(robot);
            robotPosMap.put(positions[i], robot);
        }
        robotPosList.sort(Comparator.comparingInt(a -> a.position));
        for (Robot robot : robotPosList) {
            if (!robotStack.isEmpty()) {
                while (robot != null && robot.direction == 'L' && !robotStack.isEmpty() && robotStack.peek().direction != robot.direction) {
                    Robot counter = robotStack.pop();
                    if (robot.health == counter.health) {
                        robotPosMap.remove(robot.position);
                        robotPosMap.remove(counter.position);
                        robot = null;
                        continue;
                    } else if (robot.health > counter.health) {
                        robot.health -= 1;
                        robotPosMap.remove(counter.position);
                    } else {
                        counter.health -= 1;
                        robotStack.push(counter);
                        robotPosMap.remove(robot.position);
                        robot = null;
                    }
                }
                if (robot != null) {
                    robotStack.push(robot);
                }
            } else {
                robotStack.push(robot);
            }
        }
        for (int i = 0; i < positions.length; i++) {
            if (robotPosMap.containsKey(positions[i])) {
                retList.add(robotPosMap.get(positions[i]).health);
            }
        }
        return retList;
    }

    class Robot {
        int position;
        int health;
        char direction;

        public Robot(int position, int health, char direction) {
            this.position = position;
            this.health = health;
            this.direction = direction;
        }
    }
}
