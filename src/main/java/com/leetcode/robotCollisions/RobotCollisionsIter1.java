package com.leetcode.robotCollisions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class RobotCollisionsIter1 extends AbstractParent {

    /**
     * todo - fix this by not creating robot and updating the healths array index only
     * Memory exceeded
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

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, index = 0;
        for (int i = 0; i < positions.length; i++) {
            min = Math.min(positions[i], min);
            max = Math.max(positions[i], max);
        }
        int[] posArr = new int[max - min + 1];
        for (int i = 0; i < healths.length; i++) {
            posArr[positions[i]- min]  = i;
        }
        for (int i = 0; i < posArr.length; i++) {
            if (posArr[i] < 0) {
                continue;
            }
            index = posArr[i];
            Robot robot = new Robot(positions[index], directions.charAt(index));
            if (!robotStack.isEmpty()) {
                while (robot != null && robot.direction == 'L' && !robotStack.isEmpty() && robotStack.peek().direction != robot.direction) {
                    Robot counter = robotStack.pop();
                    int counterHealth = healths[counter.position];
                    if (healths[index] == counterHealth) {
                        posArr[robot.position - min] = -1;
                        posArr[counter.position - min] = -1;
                        robot = null;
                        continue;
                    } else if (healths[index] > counterHealth) {
                        healths[index] -= 1;
                        posArr[counter.position - min] = -1;
                    } else {
                        healths[counter.position] -= 1;
                        robotStack.push(counter);
                        posArr[robot.position - min] = -1;
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
            if (posArr[positions[i] - min] >= 0) {
                retList.add(healths[positions[i] - min]);
            }
        }
        return retList;
    }

    class Robot {
        int position;
        char direction;

        public Robot(int position, char direction) {
            this.position = position;
            this.direction = direction;
        }
    }
}
