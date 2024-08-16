package com.leetcode.minMovesToSeat;
import java.util.Arrays;

public class MinMovesToSeatEveryone extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 97.35%
     * of users with Java
     * Memory
     * 44.04
     * MB
     * Beats
     * 49.16%
     * of users with Java
     * @param seats
     * @param students
     * @return
     */
    @Override
    public int minMovesToSeat(int[] seats, int[] students) {
        //return Math.abs(of(seats).sum() - of(students).sum()); - this wont work because
        // say the seats are 12, 14 and students are at 2, 17 - diff between sums = 26 - 19 = 7
        // however - the actual solution is to make 2 seat at seat 12 and 17 seat at seat 14
        // = |12-2|10 + |14 - 17|3 = 13
        Arrays.sort(seats);
        Arrays.sort(students);
        int retVal = 0;
        for (int i = 0; i < seats.length; i++) {
            retVal += Math.abs(seats[i] - students[i]);
        }
        return retVal;
    }
}
