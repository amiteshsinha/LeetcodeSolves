package com.leetcode.finalPriceWithDiscount;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 43.48
 * MB
 * Beats
 * 83.35%
 * This file was created on 18/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class FinalPriceWithSpecialShopDiscountIter1 extends AbstractParent {

    int[] priceArr;
    @Override
    public int[] finalPrices(int[] prices) {
        priceArr = prices;
        for (int i = 0; i < priceArr.length; i++) {
            priceArr[i] = priceArr[i] - findDiscount(i);
        }
        return priceArr;
    }

    private int findDiscount(int i) {
        for (int j = i + 1; j < priceArr.length; j++) {
            if (priceArr[j] <= priceArr[i]) {
                return priceArr[j];
            }
        }
        return 0;
    }

}
