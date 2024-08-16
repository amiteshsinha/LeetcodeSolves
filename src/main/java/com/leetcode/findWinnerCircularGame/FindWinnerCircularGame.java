package com.leetcode.findWinnerCircularGame;

public class FindWinnerCircularGame extends AbstractParent {

    /**
     * Runtime
     * 20
     * ms
     * Beats
     * 30.31%
     * Analyze Complexity
     * Memory
     * 40.44
     * MB
     * Beats
     * 58.65%
     * @param n
     * @param k
     * @return
     */
    // n and k are less than 500
    @Override
    public int findTheWinner(int n, int k) {
        int[] circularGameArr = new int[n];
        int countdown, i = 0, tempCount = n;
        while (tempCount != 1) {
            countdown = 0;
            while (circularGameArr[i] == 1) {
                i++;
                if (i == n) {
                    i = 0;
                }
            }
            //at this point circularGameArr[i] = 0 - we start traversing the array
            while (countdown != k) {
                while (circularGameArr[i] == 1) {
                    i++;
                    if (i == n) {
                        i = 0;
                    }
                }
                i++;
                if (i == n) {
                    i = 0;
                }
                countdown++;
            }
            //person is out
            if (i == 0) {
                i = n -1;
            } else {
                i--;
            }
            circularGameArr[i] = 1;
            tempCount--;
        }
        i = 0;
        while (circularGameArr[i] == 1) {
            i++;
        }
        return i + 1;
    }
}
