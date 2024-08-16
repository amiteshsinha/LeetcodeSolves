package com.leetcode.minNoOfDaysToMakeBouquets;

public class MinDaysToMakeMBouquetsBinarySearch extends AbstractParent {

    /**
     * binary freaking search
     * @param bloomDay
     * @param m
     * @param k
     * @return
     */
    @Override
    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length) {
            return -1;
        }
        int start = 0, end = 0, mid, minDays = -1;
        for (int i : bloomDay) {
            end = Math.max(i , end); // set end to the max days in the bloomDay array
        }
        while (start <= end) {
            mid = (start + end)/2;
            if (getNoOfBouquets(bloomDay, mid, k) >= m) {
                minDays = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minDays;
    }

    private int getNoOfBouquets(int[] bloomDay, int mid, int k) {
        int noOfBouquets = 0;
        int flowerCount = 0;
        for (int i : bloomDay) {
            if (i <= mid) {
                flowerCount++;
            } else {
                flowerCount = 0;
            }
            if (flowerCount == k) {
                noOfBouquets++;
                flowerCount = 0;
            }
        }
        return noOfBouquets;
    }
}
