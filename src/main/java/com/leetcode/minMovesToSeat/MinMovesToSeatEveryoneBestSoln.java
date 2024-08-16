package com.leetcode.minMovesToSeat;

public class MinMovesToSeatEveryoneBestSoln extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 44.00
     * MB
     * Beats
     * 65.16%
     * of users with Java
     * @param seats
     * @param students
     * @return
     */
    @Override
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] freqArr = new int[Math.max(findMax(seats), findMax(students))];
        int retVal = 0, nonMatched = 0;
        for (int i = 0; i < seats.length; i++) {
            freqArr[seats[i] - 1]++;
            freqArr[students[i] - 1]--;
        }
        // For the same example seats[12,14] and students [2,17] we get the following freqdiff array
        // [0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, -1]
        // this signifies that there is a student at 2 and the next seat available is at 12
        // simmilarly there is a seat at 14 and next available student is at 17
        // so when we start from 2nd position returnval is set to 1
        // at every index from 2 to 12 the count is incremented by +1 denoting that the student moved 1 step
        // towards the seat. once the student reaches 12 nonmatched becomes 0 and remains 0 until pos 14
        // then we repeat the same thing from pos 14 to pos 17 the seat moves (figuratively) to the student in 3 moves
        // so final retval as usual is 10 + 3 = 13
        for (int diff : freqArr) {
            retVal += Math.abs(nonMatched);
            nonMatched += diff;
        }
        return retVal;
    }

    private int findMax(int[] arr) {
        int k = -1;
        for (int i : arr) {
            if (i > k) {
                k = i;
            }
        }
        return k;
    }
}
