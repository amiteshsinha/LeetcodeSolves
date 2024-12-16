package com.leetcode.maxAvgPassRatio;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * This file was created on 15/12/24 / Sunday
 *
 * @author Amitesh Sinha
 */
public class MaxAvgPassRatio extends AbstractParent {

    @Override
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Class> queue = new PriorityQueue<>(Comparator.comparing(Class::getCalculatedAvgGain).reversed());
        for (int[] currClass : classes) {
            queue.offer(new Class(currClass[0], currClass[1]));
        }
        double classTotal = 0d;
        while (extraStudents != 0) {
            Class curr = queue.poll();
            curr.total += 1;
            curr.pass += 1;
            queue.offer(curr);
            extraStudents--;
        }
        for (Class currClass : queue) {
            classTotal += currClass.getAvg();
        }
        return classTotal/classes.length;
    }

    class Class {
        int pass;
        int total;

        public Class(int pass, int total) {
            this.pass = pass;
            this.total = total;
        }

        double getCalculatedAvgGain() {
            return (double) (pass + 1)/(total + 1) - (double) pass/total;
        }

        double getAvg() {
            return (double) pass/total;
        }
    }

}
