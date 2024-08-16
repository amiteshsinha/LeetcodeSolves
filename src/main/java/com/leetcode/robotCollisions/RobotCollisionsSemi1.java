package com.leetcode.robotCollisions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class RobotCollisionsSemi1 extends AbstractParent {

    /**
     * Runtime
     * 63
     * ms
     * Beats
     * 31.25%
     *
     * Memory
     * 71.89
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
        Map<Integer, Robot> robotPosMap = new HashMap<>();
        int[] orderedPos = Arrays.copyOf(positions, positions.length);
        for (int i = 0; i < healths.length; i++) {
         Robot robot = new Robot(positions[i], healths[i], directions.charAt(i));
            robotPosMap.put(positions[i], robot);
        }
        Arrays.sort(orderedPos);
        for (int i = 0; i < orderedPos.length; i++) {
            Robot robot = robotPosMap.get(orderedPos[i]);
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
