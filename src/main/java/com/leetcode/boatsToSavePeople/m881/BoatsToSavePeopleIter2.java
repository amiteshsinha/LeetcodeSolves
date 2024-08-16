package com.leetcode.boatsToSavePeople.m881;

public class BoatsToSavePeopleIter2 extends AbstractParent {
    /**
     * Boats can carry only max 2 people at a time.
     * This is NOT a modification of the 2 sum problem since people weights can be less than limit
     * Min boats reqd  = people.lenght/2
     * max boats reqd = people.length
     * @param people
     * @param limit
     * @return
     */
    @Override
    public int numRescueBoats(int[] people, int limit) {
        int[] freqArr = new int[limit + 1];
        for (int i : people) {
            freqArr[i]++;
        }
        int i = 1, j = freqArr.length - 1, counter = 0;
        while (i <= j) {
            while (i <= j &&freqArr[j] <= 0) {
                j--;
            }
            while (i <= j &&freqArr[i] <= 0) {
                i++;
            }
            if (i > j) {
                break;
            }
            if (i + j <= limit) {
                freqArr[i]--;
            }
            freqArr[j]--;
            counter++;
        }
        return counter;
    }
}
