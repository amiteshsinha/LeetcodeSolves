package com.leetcode.studentReplaceChalk;

public class StudentReplaceChalk extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 72.40%
     * Analyze Complexity
     * Memory
     * 57.07
     * MB
     * Beats
     * 95.70%
     * @param chalk
     * @param k
     * @return
     */
    @Override
    public int chalkReplacer(int[] chalk, int k) {
        // if k is less than the 1st element then return 0
        if (chalk[0] > k) {
            return 0;
        }
        // at every index we are updating the index to current sum value and checking
        for (int i = 1; i < chalk.length; i++) {
            chalk[i] = chalk[i] + chalk[i - 1];
            if (chalk[i] > k) {
                return i;
            }
        }
        // the last index is the sum of the array. k % sum will give us what is the remaining chalk quantity
        // we then use a binary search on the modified chalk array (which is in increasing order now) to find
        // the index of the student where chalk gets finished.
        k = k % chalk[chalk.length - 1];
        if (k == 0) {
            return 0;
        }
        int start = 0, end = chalk.length, mid;
        while (start <= end) {
            mid = (start + end)/2;
            if (chalk[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
