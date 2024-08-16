package com.leetcode.boatsToSavePeople.m881;

import java.util.Arrays;

public class BoatsToSavePeopleIter1 extends AbstractParent {
    /**
     * Boats can carry only max 2 people at a time.
     * This is NOT a modification of the 2 sum problem since people weights can be less than limit
     * Min boats reqd  = people.lenght/2
     * max boats reqd = people.length
     * Runtime
     * 18
     * ms
     * Beats
     * 6.98%
     * of users with Java
     * Memory
     * 52.77
     * MB
     * Beats
     * 98.55%
     * of users with Java
     * @param people
     * @param limit
     * @return
     */
    @Override
    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 1) {
            return 1;
        }
        // this is the max possible
        int count = people.length;
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        while (i < j) {
            if (people[j] == limit || people[j] > limit - people[i]) {
                j--;
                continue;
            }
            // here both numbers are less than limit
            if (people[i] + people[j] <= limit) {
                count--;
                i++;
                j--;
            }
        }
        return count;
    }
}
