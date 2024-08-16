package com.leetcode.avgWaitTime;

public class AvgWaitTimeResteraunt extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 72.60
     * MB
     * Beats
     * 73.06%
     * @param customers
     * @return
     */
    @Override
    public double averageWaitingTime(int[][] customers) {
        double retVal = 0;
        int current_start = 0;
        for (int[] customer : customers) {
            if (customer[0] > current_start) {
                current_start = customer[0];
            }
            current_start += customer[1];
            retVal += (double)(current_start - customer[0]);
        }
        retVal = (retVal)/customers.length;
        retVal = (double)Math.round(retVal*100000)/100000.0;
        return retVal;
    }
}
