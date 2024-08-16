package com.leetcode.minMovesToSeat;

import java.util.Arrays;

public class MinMovesToSeatEveryoneOneSort extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 62.42%
     * of users with Java
     * Memory
     * 44.01
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
        // length of array is 1 to 100
        // say we count freq of all seats (array of 100 - arr[i] denotes freq)
        // now when we iterate over students we find nearest non empty seat - can use binary search
        // or we can sort students array and then diff - so instead of 2 sorts we do 1 sort
        int[] freqArr = new int[101];
        int retVal = 0, j = 102;
        for (int i = 0; i < seats.length; i++) {
            freqArr[seats[i]]++;
            j = Math.min(seats[i], j);
        }
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            while (freqArr[j] == 0) {
                j++;
            }
            retVal += Math.abs(j - students[i]);
            freqArr[j]--;

        }
        return retVal;
    }
}
