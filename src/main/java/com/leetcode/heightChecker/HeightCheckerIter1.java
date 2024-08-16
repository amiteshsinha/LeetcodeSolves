package com.leetcode.heightChecker;

public class HeightCheckerIter1 extends AbstractParent {

    /**
     * @param heights
     * @return
     */
    @Override
    public int heightChecker(int[] heights) {
        int i, j = heights.length, temp = 0, count = 0;
        int[] freqArr = new int[101];
        //calculate all frequencies of each num
        for (i = 0; i < j; i++) {
           freqArr[heights[i]]++;
        }
        for (i = 0; i < j ; i++) {
            while (freqArr[temp] == 0) {
                temp++;
            }
            if (temp != heights[i]) {
                count++;
            }
            freqArr[temp]--;
        }
        return count;
    }
}
