package com.leetcode.finalPriceWithDiscount;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 98.90%
 *
 * Memory
 * 43.34
 * MB
 * Beats
 * 90.77%
 * This file was created on 18/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class FinalPriceWithSpecialShopDiscount extends AbstractParent {

    @Override
    public int[] finalPrices(int[] prices) {
        int arrLen = prices.length - 1;
        int[] retArr = new int[arrLen + 1];
        retArr[arrLen] = prices[arrLen];
        int j;
        for (int i = 0; i < arrLen; i++) {
            // starting from j = i + 1 figure out the smallest index where prices[j] <= prices[i]
            j = i + 1;
            while (j < arrLen && prices[j] > prices[i]) {
                j++;
            }
            if (j <= arrLen && prices[j] <= prices[i]) {
                retArr[i] = prices[i] - prices[j];
            } else {
                retArr[i] = prices[i];
            }
        }
        return retArr;
    }

}
