package com.leetcode.boatsToSavePeople.m881;

import java.util.Arrays;

public class BoatsToSavePeople extends AbstractParent {
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
     * 53.34
     * MB
     * Beats
     * 75.47%
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
        int count = 0;
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        while (i < j) {
            if (people[i] == limit) {
                count++;
                i++;
                continue;
            }
            if (people[j] == limit) {
                count++;
                j--;
                continue;
            }
            // here both numbers are less than limit
            if (people[i] + people[j] <= limit) {
                count++;
                i++;
                j--;
            } else {
                // if they are next to each other
                if (j - i == 1) {
                    count += 2;
                    break;
                } else {
                    count++;
                    j--;
                }
            }
        }
        if (i == j) {
            count++;
        }
        return count;
    }
}
